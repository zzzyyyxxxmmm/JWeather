package com.wjk32.jweather.modules.home;


import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.wjk32.jweather.R;
import com.wjk32.jweather.application.WeatherApplication;
import com.wjk32.jweather.base.BaseActivity;
import com.wjk32.jweather.di.components.DaggerWeatherComponent;
import com.wjk32.jweather.di.module.WeatherModule;
import com.wjk32.jweather.entities.WeatherFilterType;
import com.wjk32.jweather.mvp.presenter.WeatherPresenter;
import com.wjk32.jweather.mvp.view.WeatherFragment;
import com.wjk32.jweather.util.ActivityUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener
{


    private static final String CURRENT_FILTERING_KEY = "CURRENT_FILTERING_KEY";


    @BindView(R.id.refreshLayout)   RefreshLayout refreshLayout;

    @Inject
    WeatherPresenter weatherPresenter;


    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        initView();

        // Load previously saved state, if available.
        if (savedInstanceState != null) {
            WeatherFilterType currentFiltering =
                    (WeatherFilterType) savedInstanceState.getSerializable(CURRENT_FILTERING_KEY);
            weatherPresenter.setFiltering(currentFiltering);
        }


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(CURRENT_FILTERING_KEY, weatherPresenter.getFiltering());

        super.onSaveInstanceState(outState);
    }


    @Override
    protected void resolveDaggerDependency() {

    }

    private void initView() {
        ButterKnife.bind(this);


        WeatherFragment weatherFragment = (WeatherFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if (weatherFragment == null) {

            weatherFragment = WeatherFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), weatherFragment, R.id.fragment_container);
        }


        DaggerWeatherComponent.builder()
                .applicationComponent(WeatherApplication.getInstance().getApplicationComponent())
                .weatherModule(new WeatherModule(weatherFragment))
                .build().inject(this);


        //navigationView
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //pulltorefresh
        refreshLayout.setOnRefreshListener(refreshlayout -> weatherPresenter.loadWeather("Bethlehem,us"));
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {

                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败

            }
        });





    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}

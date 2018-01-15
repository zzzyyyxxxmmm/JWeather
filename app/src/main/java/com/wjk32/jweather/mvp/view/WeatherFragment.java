package com.wjk32.jweather.mvp.view;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wjk32.jweather.R;
import com.wjk32.jweather.base.BaseFragment;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.entities.WeatherDetail;
import com.wjk32.jweather.helper.WeatherHelper;
import com.wjk32.jweather.modules.home.DetailAdapter;
import com.wjk32.jweather.mvp.model.WeatherContract;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by wjk32 on 1/14/2018.
 */

public class WeatherFragment extends BaseFragment implements WeatherContract.View{

    @BindView(R.id.detail_recycler_view)
    RecyclerView detailRecyclerView;

    private DetailAdapter detailAdapter;
    private Unbinder unbinder;
    private Weather weather;
    private List<WeatherDetail> weatherDetails;

    private WeatherContract.Presenter mPresenter;



    public static WeatherFragment newInstance() {
        return new WeatherFragment();
    }

    @Override
    public void setPresenter(WeatherContract.Presenter presenter) {
        mPresenter=presenter;
    }

    @Override
    public void showWeather(Weather weather) {
        this.weather=weather;
        weatherDetails.clear();
        weatherDetails.addAll(WeatherHelper.createDetails(weather));
        detailAdapter.notifyDataSetChanged();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_page, container, false);
        unbinder = ButterKnife.bind(this, rootView);


        detailRecyclerView.setNestedScrollingEnabled(false);
        detailRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        weatherDetails = new ArrayList<>();
        detailAdapter = new DetailAdapter(weatherDetails);
        detailRecyclerView.setAdapter(detailAdapter);



        return rootView;
    }


    @Override
    public void onResume() {
        super.onResume();
        assert mPresenter != null;
        mPresenter.subscribe();
    }
    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unsubscribe();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

}

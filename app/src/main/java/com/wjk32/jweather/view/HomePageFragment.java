package com.wjk32.jweather.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wjk32.jweather.R;
import com.wjk32.jweather.base.BaseFragment;
import com.wjk32.jweather.entities.Weather;
import com.wjk32.jweather.presenter.HomePageContract;
import com.wjk32.jweather.presenter.HomePagePresenter;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by wjk32 on 1/8/2018.
 */

public class HomePageFragment extends BaseFragment implements HomePageContract.View {

    @BindView(R.id.tview)
    TextView textView;
    private Weather weather;
    private Unbinder unbinder;
    private HomePageContract.Presenter presenter;
    private OnFragmentInteractionListener onFragmentInteractionListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_home_page,container,false);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }

    public static HomePageFragment newInstance() {

        return new HomePageFragment();
    }


    @Override
    public void displayWeatherInfo(Weather weather) {
        this.weather=weather;
        onFragmentInteractionListener.updatePageTitle(weather);

        textView.setText(weather.toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        assert presenter != null;

        if(presenter==null){
            System.out.println("6666666666666666666666666666666");
        }
        //presenter.subscribe();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            onFragmentInteractionListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    public interface OnFragmentInteractionListener {
        void updatePageTitle(Weather weather);
    }

    @Override
    public void setPresenter(HomePageContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.unSubscribe();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}

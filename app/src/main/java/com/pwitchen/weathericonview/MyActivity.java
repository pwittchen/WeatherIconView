package com.pwitchen.weathericonview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.pwittchen.weathericonview.library.WeatherIconView;

/**
 * This is an exemplary Activity presenting how WeatherIconView works
 * WeatherIconView can be configured in layout. See: res/layout/activity_my.xml file
 * It can be also configured programmatically. See commented code below.
 */
public class MyActivity extends ActionBarActivity {

    private WeatherIconView weatherIconView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        weatherIconView = (WeatherIconView) findViewById(R.id.my_weather_icon);

//        Uncomment code below if you want to configure WeatherIconView programmatically.
//        After that, you can remove custom parameters from res/layout/activity_my.xml file

//        weatherIconView.setIconResource(getString(R.string.wi_day_sunny));
//        weatherIconView.setIconSize(200);
//        weatherIconView.setIconColor(Color.BLACK);
    }
}

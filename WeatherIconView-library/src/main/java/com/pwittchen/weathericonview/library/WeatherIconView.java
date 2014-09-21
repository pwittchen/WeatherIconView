package com.pwittchen.weathericonview.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class WeatherIconView extends TextView {
    private final static String PATH_TO_WEATHER_FONT = "fonts/weather.ttf";
    private final static int DEFAULT_WEATHER_ICON_SIZE = 100;
    private final static int DEFAULT_WEATHER_ICON_COLOR = Color.BLACK;
    private Typeface weatherFont;

    public WeatherIconView(Context context) {
        super(context);
        initialize(context);
    }

    public WeatherIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeAttributes(context, attrs);
        initialize(context);
    }

    public WeatherIconView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initializeAttributes(context, attrs);
        initialize(context);
    }

    private void initialize(Context context) {
        if (isInEditMode()) {
            return;
        }
        weatherFont = Typeface.createFromAsset(context.getAssets(), PATH_TO_WEATHER_FONT);
        setTypeface(weatherFont);
    }

    private void initializeAttributes(Context context, AttributeSet attrs) {
        if (isInEditMode()) {
            return;
        }

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.WeatherIconView);
        initIcon(typedArray);
        initIconSize(typedArray);
        initIconColor(typedArray);
        typedArray.recycle();
    }

    private void initIcon(TypedArray typedArray) {
        String weatherIconCode = typedArray.getString(R.styleable.WeatherIconView_weatherIcon);

        if (weatherIconCode == null) {
            return;
        }

        WeatherIcon weatherIcon = WeatherIcon.valueOf(weatherIconCode);

        if (weatherIcon == null) {
            return;
        }

        setText(weatherIcon.toString());
    }

    private void initIconSize(TypedArray typedArray) {
        int weatherIconSize = typedArray.getInt(R.styleable.WeatherIconView_weatherIconSize, DEFAULT_WEATHER_ICON_SIZE);
        setTextSize(weatherIconSize);
    }

    private void initIconColor(TypedArray typedArray) {
        int weatherIconColor = typedArray.getColor(R.styleable.WeatherIconView_weatherIconColor, DEFAULT_WEATHER_ICON_COLOR);
        setTextColor(weatherIconColor);
    }

    public void setIcon(WeatherIcon icon) {
        setText(icon.toString());
    }

    public void setIconSize(int size) {
        setTextSize(size);
    }

    public void setIconColor(int colorResource) {
        setTextColor(colorResource);
    }
}

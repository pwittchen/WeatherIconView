package com.github.pwittchen.weathericonview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.github.pwittchen.weathericonview.library.R;

/**
 * Weather Icon View allows you to create Weather Icon for your Android application
 * It's based on Erik Flowers project located at: https://github.com/erikflowers/weather-icons
 * This project is open-source and can be found at: https://github.com/pwittchen/WeatherIconView
 * @author Piotr Wittchen
 */
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
        initIconResource(typedArray);
        initIconSize(typedArray);
        initIconColor(typedArray);
        typedArray.recycle();
    }

    private void initIconResource(TypedArray typedArray) {
        String weatherIconCode = typedArray.getString(R.styleable.WeatherIconView_weatherIconResource);

        if (weatherIconCode == null || weatherIconCode.isEmpty()) {
            return;
        }

        setText(weatherIconCode);
    }

    private void initIconSize(TypedArray typedArray) {
        int weatherIconSize = typedArray.getInt(R.styleable.WeatherIconView_weatherIconSize, DEFAULT_WEATHER_ICON_SIZE);
        setTextSize(weatherIconSize);
    }

    private void initIconColor(TypedArray typedArray) {
        int weatherIconColor = typedArray.getColor(R.styleable.WeatherIconView_weatherIconColor, DEFAULT_WEATHER_ICON_COLOR);
        setTextColor(weatherIconColor);
    }

    /**
     * sets weather icon basing on String resources
     * Icons are created from weather-icons TTF font by Erik Flowers
     * Full icons reference can be found at: http://erikflowers.github.io/weather-icons/
     * @param iconCode icon code located in res/values/strings.xml file
     */
    public void setIconResource(String iconCode) {
        setText(iconCode);
    }

    /**
     * sets icon size
     * @param size icon size as an integer; default size is equal to 100
     */
    public void setIconSize(int size) {
        setTextSize(size);
    }

    /**
     * sets icon color resource
     * @param colorResource color resource - eg. Color.RED or any custom color; default is Color.BLACK
     */
    public void setIconColor(int colorResource) {
        setTextColor(colorResource);
    }
}

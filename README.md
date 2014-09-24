Weather Icon View
===============================

Android library providing custom view for displaying weather icon. 

It's useful when you are developing mobile weather app.

Weather Icon View is based on [Weather Icons](https://github.com/erikflowers/weather-icons/) project by [Erik Flowers](https://github.com/erikflowers).


## Usage

### In XML Layout

```xml
<com.pwittchen.weathericonview.library.WeatherIconView
    android:id="@+id/my_weather_icon"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    custom:weatherIconResource="@string/wi_day_sunny"
    custom:weatherIconColor="@android:color/black"
    custom:weatherIconSize="200" />
```

### In Java code (programmatically)

```java
WeatherIconView weatherIconView;
weatherIconView = (WeatherIconView) findViewById(R.id.my_weather_icon);
weatherIconView.setIconResource(getString(R.string.wi_day_sunny));
weatherIconView.setIconSize(200);
weatherIconView.setIconColor(Color.BLACK);
```

## Icons reference

Icons reference is available at: http://erikflowers.github.io/weather-icons/

In Weather Icon View for Android, dashes (-) are replaced with underscores (_), but names of the icons are the same.

## Example

Example presenting, how to use this library is provided in [app](https://github.com/pwittchen/WeatherIconView/tree/master/app) directory of this repository.

## Screenshot

![Screenshot](screenshot.png "Screenshot")

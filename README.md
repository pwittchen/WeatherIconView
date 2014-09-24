Weather Icon View
===============================

Android library providing custom view for displaying weather icon.
This view is based on [Weather Icons](https://github.com/erikflowers/weather-icons/) project by [Erik Flowers](https://github.com/erikflowers).

Library will be described in details in the future. Project is not finished yet.

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

## Example

Example presenting, how to use this library is provided in [app](https://github.com/pwittchen/WeatherIconView/tree/master/app) directory of this repository.

## Screenshot

![Screenshot](screenshot.png "Screenshot")

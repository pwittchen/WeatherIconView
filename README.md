Weather Icon View
===============================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Weather%20Icon%20View-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1393)

Android library providing custom view for displaying weather icon. 

Weather Icon View is based on [Weather Icons](https://github.com/erikflowers/weather-icons/) project by [Erik Flowers](https://github.com/erikflowers).


## Usage

### In XML Layout

```xml
<com.pwittchen.weathericonview.library.WeatherIconView
    android:id="@+id/my_weather_icon"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    custom:weatherIconResource="@string/wi_day_sunny_overcast"
    custom:weatherIconColor="@android:color/black"
    custom:weatherIconSize="100" />
```

### In Java code (programmatically)

```java
WeatherIconView weatherIconView;
weatherIconView = (WeatherIconView) findViewById(R.id.my_weather_icon);
weatherIconView.setIconResource(getString(R.string.wi_day_sunny_overcast));
weatherIconView.setIconSize(100);
weatherIconView.setIconColor(Color.BLACK);
```

## Icons reference

Icons reference is available at: http://erikflowers.github.io/weather-icons/

In Weather Icon View for Android, dashes (-) are replaced with underscores (_), but names of the icons are the same.

## Example

Example presenting, how to use this library is provided in `app` directory of this repository.

## Screenshot

![Screenshot](screenshot.png "Screenshot")

License
-------

    Copyright 2015 Piotr Wittchen

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

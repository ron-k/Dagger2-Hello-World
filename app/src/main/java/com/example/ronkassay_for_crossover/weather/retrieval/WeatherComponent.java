package com.example.ronkassay_for_crossover.weather.retrieval;

import com.example.ronkassay_for_crossover.weather.LocationInfo;
import com.example.ronkassay_for_crossover.weather.display.WeatherDisplayComponent;
import com.example.ronkassay_for_crossover.weather.display.WeatherDisplayModule;
import com.example.ronkassay_for_crossover.widget.WeatherUpdateService;

import dagger.Subcomponent;

/**
 * Created by Ron Kassay on 2017-03-31.
 */
@Subcomponent(modules = {WeatherModule.class})
public interface WeatherComponent {
    WeatherDisplayComponent plus(WeatherDisplayModule weatherDisplayModule);

    LocationInfo locationInfo();

    WeatherModel weatherModel();

    void inject(WeatherUpdateService weatherUpdateService);
}
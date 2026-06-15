package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
public class WeatherStation {
    private List<Device> devices =
            new ArrayList<>();

    private float temperature;

    public void registerDevice(
            Device device){

        devices.add(device);
    }

    public void notifyObservers(){

        for(Device d : devices){
            d.update(temperature);
        }
    }

    public void setTemperature(
            float temp){

        temperature=temp;

        System.out.println(
                "\nWeather changed to "
                        + temperature + "°C"
        );

        notifyObservers();
    }
}

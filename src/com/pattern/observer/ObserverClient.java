package com.pattern.observer;

public class ObserverClient {
    public static void main(String[] args){

        WeatherStation station =
                new WeatherStation();

        station.registerDevice(
                new MobileDisplay());

        station.registerDevice(
                new SmartWatch());

        station.setTemperature(28);
        station.setTemperature(32);
    }
}

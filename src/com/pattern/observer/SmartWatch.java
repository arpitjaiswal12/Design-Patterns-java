package com.pattern.observer;

public class SmartWatch implements Device{
    public void update(float temperature){
        System.out.println(
                "Smart Watch: Temperature updated to "
                        + temperature + "°C"
        );
    }
}

package com.pattern.observer;

public class MobileDisplay implements Device{
    public void update(float temperature){
        System.out.println(
                "Mobile App: Temperature updated to "
                        + temperature + "°C"
        );
    }
}

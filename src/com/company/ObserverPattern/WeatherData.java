package com.company.ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observerArrayList;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(){
        observerArrayList = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer ob) {
        observerArrayList.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        if (null != ob) {
            observerArrayList.remove(ob);
        }
    }

    @Override
    public void notifyObserver() {
        observerArrayList.forEach(observer -> {
            observer.update(this.temperature, this.humidity, this.pressure);
        });
    }


    private void updateValues(double temperature, double humidity, double pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObserver();
    }
}

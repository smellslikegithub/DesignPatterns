package com.company.ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private double temperature;
    private double humidity;

    CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: "+ this.temperature + " F degrees");
        System.out.println("Humidity: "+ this.humidity + "%");
    }
}

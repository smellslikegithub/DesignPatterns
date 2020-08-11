package com.company.ObserverPattern;

public interface Subject { // The WeatherData is my subject
    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObserver();
}

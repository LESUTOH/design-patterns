package com.hollyland;

/**
 * @ClassName CurrentConditionsDisplay
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/27 17:43
 **/
public class CurrentConditionsDisplay implements Observer, DisplyElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and" + humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}

package Observer;

public class CurrentWeather implements ObserverObject, DisplayObject{
    Subject weatherStation;
    private float temp;
    private  float currentPressure;
    private float humidity;

    public CurrentWeather(Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.temp = temp;
        this.currentPressure = currentPressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + " °C, Pressure: " + currentPressure + " Pa, Humidity: " + humidity + " %");
    }
}

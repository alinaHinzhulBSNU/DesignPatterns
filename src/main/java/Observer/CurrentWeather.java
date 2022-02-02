package Observer;

public class CurrentWeather implements ObserverObject, DisplayObject{
    private float temp;
    private  float currentPressure;
    private float humidity;

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.temp = temp;
        this.currentPressure = currentPressure;
        this.humidity = humidity;
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temp + " °C, Pressure: " + currentPressure + " Pa, Humidity: " + humidity + " %");
    }
}

package Observer;

public class Statistics implements ObserverObject, DisplayObject {
    private float minTemp;
    private  float temp;
    private float maxTemp;

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.minTemp = minTemp;
        this.temp = temp;
        this.maxTemp = maxTemp;
    }

    @Override
    public void display() {
        System.out.println("Min temp: " + minTemp + " °C, Temp: " + temp + " °C, Max temp: " + maxTemp + " °C");
    }
}

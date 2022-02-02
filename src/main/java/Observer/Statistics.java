package Observer;

public class Statistics implements ObserverObject, DisplayObject {
    Subject weatherStation;
    private float minTemp;
    private  float temp;
    private float maxTemp;

    public Statistics(Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.minTemp = minTemp;
        this.temp = temp;
        this.maxTemp = maxTemp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Min temp: " + minTemp + " °C, Temp: " + temp + " °C, Max temp: " + maxTemp + " °C");
    }
}

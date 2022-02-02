package Observer;

import java.util.ArrayList;

public class WeatherInfo implements Subject{
    private ArrayList<ObserverObject> observers;
    private float minTemp, maxTemp, temp, lastPressure, currentPressure, humidity;
    private boolean initialized; // Дані про погоду були ініціалізовані?

    public WeatherInfo(){
        this.observers = new ArrayList<ObserverObject>();
        this.initialized = false;
    }

    @Override
    public void addObserver(ObserverObject observerObject) {
        observers.add(observerObject);
    }

    @Override
    public void removeObserver(ObserverObject observerObject) {
        observers.remove(observerObject);
    }

    @Override
    public void notifyObservers() {
        for (ObserverObject observer: observers) {
            observer.update(minTemp, maxTemp, temp, lastPressure, currentPressure, humidity);
        }
    }

    public void setData(float temp, float humidity, float pressure){
        if (!initialized){
            this.minTemp = temp;
            this.maxTemp = temp;
            this.lastPressure = pressure;
            this.currentPressure = pressure;
            this.initialized = true;
        }else{
            this.minTemp = Math.min(this.minTemp, temp);
            this.maxTemp = Math.max(this.maxTemp, temp);
            this.lastPressure = this.currentPressure;
            this.currentPressure = pressure;
        }
        this.temp = temp;
        this.humidity = humidity;

        notifyObservers();
    }
}

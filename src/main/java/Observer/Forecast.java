package Observer;

public class Forecast implements ObserverObject, DisplayObject{
    Subject weatherStation;
    private  float lastPressure;
    private  float currentPressure;

    public Forecast(Subject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.lastPressure = lastPressure;
        this.currentPressure = currentPressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}

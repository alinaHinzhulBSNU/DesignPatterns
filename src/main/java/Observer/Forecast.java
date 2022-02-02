package Observer;

public class Forecast implements ObserverObject, DisplayObject{
    private  float lastPressure;
    private  float currentPressure;

    @Override
    public void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity) {
        this.lastPressure = lastPressure;
        this.currentPressure = currentPressure;
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

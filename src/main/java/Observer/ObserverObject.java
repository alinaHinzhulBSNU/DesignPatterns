package Observer;

public interface ObserverObject {
    void update(float minTemp, float maxTemp, float temp, float lastPressure, float currentPressure, float humidity);
}

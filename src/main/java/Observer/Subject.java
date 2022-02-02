package Observer;

public interface Subject {
    void addObserver(ObserverObject observerObject);
    void removeObserver(ObserverObject observerObject);
    void notifyObservers();
}

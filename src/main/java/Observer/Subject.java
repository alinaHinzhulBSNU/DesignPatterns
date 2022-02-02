package Observer;

import java.util.ArrayList;

public interface Subject {
    ArrayList<ObserverObject> observers = new ArrayList<>();

    void addObserver(ObserverObject observerObject);
    void removeObserver(ObserverObject observerObject);
    void notifyObservers();
}

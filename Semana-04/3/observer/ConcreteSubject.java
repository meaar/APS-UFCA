package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer o) {
        this.observers.add(o);
    }
    @Override
    public void dettach(Observer o) {
        this.observers.remove(o);
    }
    @Override
    public void notifyAllObservers(Message message) {
        for (Observer observer : observers) {
            observer.notifyObserver(message);
        }
    }
    
}

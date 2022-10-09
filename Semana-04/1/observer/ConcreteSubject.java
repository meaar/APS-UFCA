package observer;

import java.util.ArrayList;

public class ConcreteSubject implements NewsSubject {

    private ArrayList<ConsumesNewsObserver> observers = new ArrayList<ConsumesNewsObserver>();
    
    @Override
    public void attach(ConsumesNewsObserver observer) {
        this.observers.add(observer);
    }
    @Override
    public void dettach(ConsumesNewsObserver observer) {
        for (int i = 0; i < this.observers.size(); i++) {
            if (this.observers.get(i).equals(observer)) {
                this.observers.remove(i);
                break;
            }
        }
    }
    @Override
    public void notifyNews(String text, int day, int month, String topic) {
        for (ConsumesNewsObserver consumesNewsObserver : observers) {
            consumesNewsObserver.notifyNews(text, day, month, topic);
        }
    }

}

package observer;

public abstract class LabelsConcreteObserver implements Observer {

    private ConcreteSubject concreteSubject;
    private String text;

    public LabelsConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.attach(this);
    }
    public abstract void action(Message message);
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public void update(Message message) {
        this.concreteSubject.notifyAllObservers(message);
    }
    @Override
    public void notifyObserver(Message message) {
        action(message);
    }
    
}

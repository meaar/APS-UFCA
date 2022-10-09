package observer;


public class NewsSubscribeConcreteObserver implements ConsumesNewsObserver {
    
    private boolean state;
    private ConcreteSubject concreteSubject;
    
    public NewsSubscribeConcreteObserver(ConcreteSubject c) {
        this.concreteSubject = c;
        c.attach(this);
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    @Override
    public void updateObserver(String text, int day, int month, String topic) {
        this.concreteSubject.notifyNews(text, day, month, topic);
    }
    @Override
    public void notifyNews(String text, int day, int month, String topic) {
        System.out.println(text);
    }
    
}

package observer;

public interface Subject {

    public void attach(Observer o);
    public void dettach(Observer o);
    public void notifyAllObservers(Message message);

}

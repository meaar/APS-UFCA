package observer;

public interface Observer {

    public void update(Message message);
    public void notifyObserver(Message message);

}

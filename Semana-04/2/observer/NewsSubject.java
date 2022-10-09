package observer;

public interface NewsSubject {

    public void attach(ConsumesNewsObserver observer);
    public void dettach(ConsumesNewsObserver observer);
    public void notifyNews(String text, int day, int month, String topic);

}

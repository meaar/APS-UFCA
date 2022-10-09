package observer;

public interface ConsumesNewsObserver {

	public void updateObserver(String text, int day, int month, String topic);
    public void notifyNews(String text, int day, int month, String topic);

}

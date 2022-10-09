package observer;


public class publishers implements ConsumesNewsObserver {
    
    @Override
    public void updateObserver(String text, int day, int month, String topic) {
        
    }
    @Override
    public void notifyNews(String text, int day, int month, String topic) {
        System.out.println(text);
    }
    
}

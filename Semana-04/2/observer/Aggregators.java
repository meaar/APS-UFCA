package observer;

import java.util.ArrayList;

public abstract class Aggregators implements ConsumesNewsObserver {

    private ConcreteSubject concreteSubject;
    private ArrayList<News> news = new ArrayList<News>();

    public Aggregators(ConcreteSubject c) {
        this.concreteSubject = c;
        c.attach(this);
    }
    public abstract void addNews(News news);
    public ArrayList<News> getNews() {
        return news;
    }
    @Override
    public void updateObserver(String text, int day, int month, String topic) {
        this.concreteSubject.notifyNews(text, day, month, topic);
    }
    @Override
    public void notifyNews(String text, int day, int month, String topic) {
        System.out.println(text+"\nData: "+day+"/"+month+"\nTopico: "+topic);
    }
    
}

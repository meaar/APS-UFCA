package observer;

public class News {

    private String text;
    private int day;
    private int month;
    private String topic;
    
    public News(String text, int day, int month, String topic) {
        this.text = text;
        this.day = day;
        this.month = month;
        this.topic = topic;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

}

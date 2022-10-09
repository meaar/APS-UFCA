package observer;

public class App {
    public static void main(String[] args) {

        Message message = new Message("Hello World!");

        ConcreteSubject concreteSubject = new ConcreteSubject();

        Labels_uppercase concreteObserver1 = new Labels_uppercase(concreteSubject);
        Labels_charNumber concreteObserver2 = new Labels_charNumber(concreteSubject);
        Labels_wordsNumber concreteObserver3 = new Labels_wordsNumber(concreteSubject);
        concreteObserver1.update(message);
        message.setMessagem("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
        concreteObserver2.update(message);
        message.setMessagem("Test");
        concreteObserver3.update(message);
        
    }
}
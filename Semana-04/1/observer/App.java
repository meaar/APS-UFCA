package observer;

public class App {
    public static void main(String[] args) {

        ConcreteSubject a = new ConcreteSubject();
        NewsSubscribeConcreteObserver ob1 = new NewsSubscribeConcreteObserver(a);
        NewsSubscribeConcreteObserver ob2 = new NewsSubscribeConcreteObserver(a);
        ob1.updateObserver("Harry Potter e a Pedra Filosofal", 1, 8, "Livro");
        ob2.updateObserver("STAR WARS", 1, 7, "Livro");
        
    }
}

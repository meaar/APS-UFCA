package observer;

public class Labels_charNumber extends LabelsConcreteObserver { 

    public Labels_charNumber(ConcreteSubject concreteSubject) {
        super(concreteSubject);
    }
    @Override
    public void action(Message message) {
        System.out.println("Numero de caracters: "+message.getMessagem().length());
    }
    
}

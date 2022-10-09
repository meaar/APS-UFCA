package observer;

public class Labels_uppercase extends LabelsConcreteObserver {

    public Labels_uppercase(ConcreteSubject concreteSubject) {
        super(concreteSubject);
    }
    @Override
    public void action(Message message) {
        System.out.println("Texto em maiusculo: "+message.getMessagem().toUpperCase());
    }
    
}

package observer;

public class Labels_wordsNumber extends LabelsConcreteObserver {

    public Labels_wordsNumber(ConcreteSubject concreteSubject) {
        super(concreteSubject);
    }
    @Override
    public void action(Message message) {
        String text = message.getMessagem();
        int count = 0;
        if (text.length() > 0) {
            count = 1;
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Numero de palavras: "+count);
    }
    
}

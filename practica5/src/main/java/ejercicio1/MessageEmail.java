package ejercicio1;

public class MessageEmail extends Message {

    public MessageEmail(String text) {
        super(text);
    }

    @Override
    public void send() {
        System.out.println("[Email]" + super.getText());
    }
}

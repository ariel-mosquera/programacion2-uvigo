package ejercicio1;

public class MessageSMS extends Message {

    public MessageSMS(String text) {
        super(text);
    }

    @Override
    public void send() {
        System.out.println("[SMS]" + super.getText());
    }
}

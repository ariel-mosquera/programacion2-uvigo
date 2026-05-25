package ejercicio1;

public class MessageApp extends Message {

    public MessageApp(String text) {
        super(text);
    }

    @Override
    public void send() {
        System.out.println("[App]" + super.getText());
    }
}

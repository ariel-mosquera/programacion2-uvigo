package ejercicio1;

public abstract class Message {

        // private NotificationType type;
        private String text;

        public Message(String text) {
                // this.type = type;
                this.text = text;
        }

        // public NotificationType getType() {
        // return type;
        // }

        public String getText() {
                return text;
        }

        abstract void send();
}

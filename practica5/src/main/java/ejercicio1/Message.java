package ejercicio1;

public class Message {

        private NotificationType tipo;
        private String texto;

        public Message(NotificationType tipo, String texto) {
                this.tipo = tipo;
                this.texto = texto;
        }

        public NotificationType getTipo() {
                return tipo;
        }

        public String getTexto() {
                return texto;
        }
}

package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class IfElseMainNotificationProof {

        public static void main(String[] args) {

                List<Message> mensajes = new ArrayList<>();

                mensajes.add(new Message(NotificationType.EMAIL, "Este es el contenido del email."));

                mensajes.add(new Message(NotificationType.SMS, "Este es el contenido del SMS."));

                mensajes.add(new Message(NotificationType.APP, "Este es el contenido de la notificación de la app."));

                for (Message message : mensajes) {
                        // Cada mensaje lleva un prefijo distinto
                        if (message.getTipo() == NotificationType.EMAIL) {
                                System.out.println("[Email] " + message.getTexto());
                        } else if (message.getTipo() == NotificationType.SMS) {
                                System.out.println("[SMS] " + message.getTexto());
                        } else if (message.getTipo() == NotificationType.APP) {
                                System.out.println("[App] " + message.getTexto());
                        }
                }
        }
}
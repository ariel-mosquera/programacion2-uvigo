package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class IfElseMainNotificationProof {

        public static void main(String[] args) {

                List<Message> messages = new ArrayList<>();

                messages.add(new MessageEmail("Este es el contenido del email."));

                messages.add(new MessageSMS("Este es el contenido del SMS."));

                messages.add(new MessageApp("Este es el contenido de la notificación de la app."));

                for (Message message : messages)
                        message.send();
        }
}
package dosw.bitacora.corte2.semana1.ejercicio1_notificaciones;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Enviando SMS a " + userId + ": " + message);
    }
}

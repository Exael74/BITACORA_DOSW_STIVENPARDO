package dosw.bitacora.corte2.semana1.ejercicio1_notificaciones;

public class PushNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Enviando Push Notification a " + userId + ": " + message);
    }
}

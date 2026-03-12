package dosw.bitacora.corte2.semana1.ejercicio1_notificaciones;

public class NotificationService {

    private static NotificationService instance;
    private NotificationStrategy notificationStrategy;

    private NotificationService() {
        // Por defecto usar Email si no se configura otra
        this.notificationStrategy = new EmailNotification();
    }

    public static synchronized NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notifyUser(String userId, String message) {
        if (this.notificationStrategy == null) {
            throw new IllegalStateException("Estrategia de notificación no configurada");
        }
        this.notificationStrategy.sendNotification(userId, message);
    }
}

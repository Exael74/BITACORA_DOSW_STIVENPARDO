package dosw.bitacora.corte2.semana1.ejercicio1_notificaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSingletonInstance() {
        NotificationService instance1 = NotificationService.getInstance();
        NotificationService instance2 = NotificationService.getInstance();

        assertNotNull(instance1);
        assertSame(instance1, instance2, "Ambas referencias deben apuntar a la misma instancia (Singleton)");
    }

    @Test
    public void testSetAndUseStrategies() {
        NotificationService service = NotificationService.getInstance();

        // Email
        service.setNotificationStrategy(new EmailNotification());
        assertDoesNotThrow(() -> service.notifyUser("User1", "Hola Email"));

        // SMS
        service.setNotificationStrategy(new SMSNotification());
        assertDoesNotThrow(() -> service.notifyUser("User2", "Hola SMS"));

        // Push
        service.setNotificationStrategy(new PushNotification());
        assertDoesNotThrow(() -> service.notifyUser("User3", "Hola Push"));
    }
}

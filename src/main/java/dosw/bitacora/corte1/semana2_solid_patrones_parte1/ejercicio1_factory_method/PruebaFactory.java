package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio1_factory_method;

public class PruebaFactory {
    public static void main(String[] args) {
        FabricaNotificaciones fabrica = new FabricaNotificaciones();

        System.out.println("--- Prueba Factory Method: Notificaciones ---");

        Notificacion email = fabrica.crearNotificacion("CORREO");
        email.enviarMensaje("usuario@ejemplo.com", "Bienvenido a nuestra plataforma.");

        Notificacion sms = fabrica.crearNotificacion("sms");
        sms.enviarMensaje("3001234567", "Tu codigo de verificacion es 9876.");

        Notificacion push = fabrica.crearNotificacion("Push");
        push.enviarMensaje("UserDevice_001", "Tienes una nueva actualizacion disponible.");
    }
}


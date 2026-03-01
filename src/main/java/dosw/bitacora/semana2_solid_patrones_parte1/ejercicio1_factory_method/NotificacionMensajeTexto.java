package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio1_factory_method;

public class NotificacionMensajeTexto implements Notificacion {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando SMS al numero [" + destinatario + "]: " + contenido);
    }
}

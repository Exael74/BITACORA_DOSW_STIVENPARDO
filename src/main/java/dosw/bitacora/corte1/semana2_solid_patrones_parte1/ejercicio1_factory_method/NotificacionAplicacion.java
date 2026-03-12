package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio1_factory_method;

public class NotificacionAplicacion implements Notificacion {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando PUSH NOTIFICATION al dispositivo de [" + destinatario + "]: " + contenido);
    }
}


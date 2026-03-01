package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio1_factory_method;

public class FabricaNotificaciones {
    public Notificacion crearNotificacion(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        switch (tipo.toUpperCase()) {
            case "CORREO":
                return new NotificacionCorreo();
            case "SMS":
                return new NotificacionMensajeTexto();
            case "PUSH":
                return new NotificacionAplicacion();
            default:
                throw new IllegalArgumentException("Tipo de notificación desconocido: " + tipo);
        }
    }
}

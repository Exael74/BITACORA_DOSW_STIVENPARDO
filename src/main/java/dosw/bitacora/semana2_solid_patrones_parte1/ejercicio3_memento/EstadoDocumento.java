package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio3_memento;

public class EstadoDocumento {
    private final String contenido;

    public EstadoDocumento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}

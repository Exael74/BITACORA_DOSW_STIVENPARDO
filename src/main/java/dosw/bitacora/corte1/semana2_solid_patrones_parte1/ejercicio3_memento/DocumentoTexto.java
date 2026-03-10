package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio3_memento;

public class DocumentoTexto {
    private String contenidoActual;

    public void escribir(String texto) {
        System.out.println("Escribiendo: " + texto);
        this.contenidoActual = texto;
    }

    public String getContenidoActual() {
        return contenidoActual;
    }

    // Crea el memento guardando el estado actual
    public EstadoDocumento guardarEstado() {
        System.out.println("Guardando estado del documento: [" + contenidoActual + "]");
        return new EstadoDocumento(contenidoActual);
    }

    // Restaura desde un memento
    public void restaurarEstado(EstadoDocumento memento) {
        this.contenidoActual = memento.getContenido();
        System.out.println("Estado restaurado a: [" + contenidoActual + "]");
    }
}


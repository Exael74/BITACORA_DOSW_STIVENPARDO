package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio3_memento;

public class PruebaMemento {
    public static void main(String[] args) {
        System.out.println("--- Prueba Patron Memento: Editor de Texto ---");

        DocumentoTexto documento = new DocumentoTexto();
        ControladorHistorial controlador = new ControladorHistorial();

        documento.escribir("Version 1 (Borrador)");
        controlador.guardar(documento.guardarEstado());

        documento.escribir("Version 2 (Revision)");
        controlador.guardar(documento.guardarEstado());

        documento.escribir("Version 3 (Final equivocada)");
        System.out.println("Oops, me equivoque en la version 3. Deshaciendo...");

        // Deshacer al estado 2
        documento.restaurarEstado(controlador.deshacer());

        // Deshacer al estado 1
        documento.restaurarEstado(controlador.deshacer());
    }
}


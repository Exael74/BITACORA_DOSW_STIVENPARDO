package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio2_adapter;

public class ImpresoraAvanzada {
    public void printConCalidadAlta(String contenido, int dpi) {
        System.out.println("--- MODO ALTA CALIDAD ---");
        System.out.println("Imprimiendo a " + dpi + " DPI: " + contenido);
        System.out.println("-------------------------");
    }
}


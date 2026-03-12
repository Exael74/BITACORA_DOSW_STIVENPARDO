package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio2_adapter;

public class PruebaAdapter {
    public static void main(String[] args) {
        System.out.println("--- Prueba Patron Adapter: Impresoras ---");

        // Uso de la clase incompatible original a traves del adaptador
        ImpresoraAvanzada impresoraModerna = new ImpresoraAvanzada();
        ImpresoraBasica adaptador = new AdaptadorImpresora(impresoraModerna);

        // El cliente solo usa el metodo de la interfaz basica
        adaptador.imprimirDocumento("Este es mi reporte final del semestre.");
    }
}


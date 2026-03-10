package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio2_adapter;

public class AdaptadorImpresora implements ImpresoraBasica {
    private ImpresoraAvanzada impresoraAvanzada;

    public AdaptadorImpresora(ImpresoraAvanzada impresoraAvanzada) {
        this.impresoraAvanzada = impresoraAvanzada;
    }

    @Override
    public void imprimirDocumento(String texto) {
        System.out.println("Adaptando la impresion simple hacia el sistema avanzado...");
        impresoraAvanzada.printConCalidadAlta(texto, 300);
    }
}


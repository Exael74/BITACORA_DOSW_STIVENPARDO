package dosw.bitacora.semana2_3.patrones.comportamiento.strategy.navegacion;

public class FasterRoute implements RouteStrategy {

    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más rápida...");
    }

}

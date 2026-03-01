package dosw.bitacora.semana2_3.patrones.comportamiento.strategy.navegacion;

public class MainClass {
    public static void main(String[] args) {
        NavigationApp app = new NavigationApp(new FasterRoute());
        app.startNavigation();

        app.setRouteStrategy(new ScenicRoute());
        app.startNavigation();

        app.setRouteStrategy(new CheapestRoute());
        app.startNavigation();
    }
}

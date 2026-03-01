package dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA;

import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;

public class PlayStationUI implements UI{
    @Override
    public void render() {
        System.out.println("Rendering PlayStation UI...");
    }
}

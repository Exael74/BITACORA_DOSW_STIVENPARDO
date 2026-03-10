package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;

public class PlayStationGame implements Game {
    @Override
    public void start() {
        System.out.println("Starting PlayStation Game...");
    }

}


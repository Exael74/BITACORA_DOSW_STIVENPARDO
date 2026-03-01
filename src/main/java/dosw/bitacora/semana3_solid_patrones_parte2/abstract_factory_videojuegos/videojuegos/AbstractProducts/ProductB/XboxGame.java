package dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB;

import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;

public class XboxGame implements Game {
    @Override
    public void start() {
        System.out.println("Starting Xbox Game...");
    }

}

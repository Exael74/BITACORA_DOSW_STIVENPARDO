package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;

public class PlayStationController implements Controller {
    @Override
    public void connect() {
        System.out.println("PlayStation Controller: Button Pressed!");
    }

}


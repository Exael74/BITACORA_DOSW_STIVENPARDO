package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;

public class XboxController implements Controller {
    @Override
    public void connect() {
        System.out.println("Xbox Controller: Button Pressed!");
    }

}


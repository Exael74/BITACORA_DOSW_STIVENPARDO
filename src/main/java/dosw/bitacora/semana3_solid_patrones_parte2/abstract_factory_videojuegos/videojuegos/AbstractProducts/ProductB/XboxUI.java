package dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB;

import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;

public class XboxUI implements UI {
    @Override
    public void render() {
        System.out.println("Rendering Xbox UI...");
    }

}

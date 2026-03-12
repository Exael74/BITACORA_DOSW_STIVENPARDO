package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI createUI();
}


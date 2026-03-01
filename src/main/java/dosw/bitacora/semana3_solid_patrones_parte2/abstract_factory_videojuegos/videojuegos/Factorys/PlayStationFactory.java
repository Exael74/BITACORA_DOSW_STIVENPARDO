package dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys;

import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;
import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;
import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;
import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA.PlayStationController;
import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA.PlayStationGame;
import dosw.bitacora.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductA.PlayStationUI;

public class PlayStationFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public UI createUI() {
        return new PlayStationUI();
    }

}

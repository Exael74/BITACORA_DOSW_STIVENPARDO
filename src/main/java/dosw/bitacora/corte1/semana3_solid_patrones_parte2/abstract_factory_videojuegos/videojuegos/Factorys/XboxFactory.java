package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB.XboxController;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB.XboxGame;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.ProductB.XboxUI;

public class XboxFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI createUI() {
        return new XboxUI();
    }

}


package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Controller;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.Game;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.AbstractProducts.UI;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys.ConsoleFactory;

public class GameEnginee {
    private ConsoleFactory consoleFactory;
    private Controller controller;
    private Game game;
    private UI ui;

    public GameEnginee(ConsoleFactory consoleFactory) {
        this.consoleFactory = consoleFactory;
        this.controller = consoleFactory.createController();
        this.game = consoleFactory.createGame();
        this.ui = consoleFactory.createUI();
    }

    public void run() {
        controller.connect();
        game.start();
        ui.render();
    }
}


package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.command.videojuego;

public class GameController {
    private Command command;

    public void pressButton(Command command) {
        this.command = command;
        command.execute();
    }

}


package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.command.videojuego;

public class JumpCommand implements Command{
    private GameCharacter character;

    public JumpCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }

}


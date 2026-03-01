package dosw.bitacora.semana2_3.patrones.comportamiento.command.videojuego;

public class WalkCommand implements Command{
    private GameCharacter character;

    public WalkCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}

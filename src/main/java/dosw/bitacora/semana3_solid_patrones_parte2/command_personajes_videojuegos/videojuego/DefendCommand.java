package dosw.bitacora.semana2_3.patrones.comportamiento.command.videojuego;

public class DefendCommand implements Command {
    private GameCharacter character;

    public DefendCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.defend();
    }
}

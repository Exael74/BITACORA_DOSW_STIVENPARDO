package dosw.bitacora.semana2_3.patrones.comportamiento.command.videojuego;

import java.util.List;

public class MainClass {
    
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();
        GameController controller = new GameController();
        
        List<Command> actions = List.of(
            new WalkCommand(character),
            new JumpCommand(character),
            new AttackCommand(character),
            new DefendCommand(character)
        );

        actions.forEach(controller::pressButton);
    }
}

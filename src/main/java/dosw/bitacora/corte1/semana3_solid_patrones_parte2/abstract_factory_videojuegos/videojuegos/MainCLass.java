package dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys.ConsoleFactory;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys.PlayStationFactory;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.abstract_factory.videojuegos.Factorys.XboxFactory;

public class MainCLass {
    public static void main(String[] args) {
        ConsoleFactory factory;

        System.out.println("Running PlayStation Game:");

        factory = new PlayStationFactory();
        GameEnginee enginee = new GameEnginee(factory);
        enginee.run();

        System.out.println("Running Xbox Game:");
        
        factory = new XboxFactory();
        enginee = new GameEnginee(factory);
        enginee.run();

    }
}


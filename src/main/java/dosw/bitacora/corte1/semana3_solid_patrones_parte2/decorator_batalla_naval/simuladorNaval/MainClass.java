package dosw.bitacora.corte1.semana2_3.patrones.estructurales.decorator.simuladorNaval;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        Barco barcoInicial = new BaseShip(10, 10, "Barco Base");
        Barco barcoFinal = barcoInicial;
        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES",
                "ANTITROPEDOS"
        );

        for (String mejora : configuracion) {
            barcoFinal = switch (mejora) {
                case "BLINDAJE" -> new BlindajeDecorator(barcoFinal);
                case "RADAR" -> new RadarDecorator(barcoFinal);
                case "MISILES" -> new MisilesDecorator(barcoFinal);
                case "ANTITROPEDOS" -> new AntiTorpedosDecorator(barcoFinal);
                default -> barcoFinal;
            };
        }
        
        System.out.println("Barco inicial:");
        System.out.println(barcoInicial.getDescription());
        System.out.println("Ataque: " + barcoInicial.getATK());
        System.out.println("Defensa: " + barcoInicial.getDEF());

        System.out.println("Barco final:");
        System.out.println(barcoFinal.getDescription());
        System.out.println("Ataque: " + barcoFinal.getATK());
        System.out.println("Defensa: " + barcoFinal.getDEF());
    }
}


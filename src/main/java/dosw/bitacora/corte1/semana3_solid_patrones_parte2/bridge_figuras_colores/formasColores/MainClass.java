package dosw.bitacora.corte1.semana2_3.patrones.estructurales.bridge.formasColores;

import dosw.bitacora.corte1.semana2_3.patrones.estructurales.bridge.formasColores.bridge.*;

public class MainClass {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        Shape blueCircle = new Circle(new Blue());
        Shape redSquare = new Square(new Red());


        redCircle.draw();
        blueSquare.draw();
        blueCircle.draw();
        redSquare.draw();
        
    }
}


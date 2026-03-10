package dosw.bitacora.corte1.semana2_3.patrones.estructurales.bridge.formasColores;

import dosw.bitacora.corte1.semana2_3.patrones.estructurales.bridge.formasColores.bridge.Color;
import dosw.bitacora.corte1.semana2_3.patrones.estructurales.bridge.formasColores.bridge.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color.getColor() + " square.");
    }

}


package dosw.bitacora.semana2_3.patrones.estructurales.bridge.formasColores;

import dosw.bitacora.semana2_3.patrones.estructurales.bridge.formasColores.bridge.Color;
import dosw.bitacora.semana2_3.patrones.estructurales.bridge.formasColores.bridge.Shape;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color.getColor() + " circle.");
    }

}

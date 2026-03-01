package dosw.bitacora.semana2_3.patrones.estructurales.bridge.formasColores.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}

package dosw.bitacora.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public class BaseShip implements Barco {
    private int atk;
    private int def;
    private String descripcion;

    public BaseShip(int atk, int def, String descripcion) {
        this.atk = atk;
        this.def = def;
        this.descripcion = descripcion;
    }

    @Override
    public int getATK() {
        return atk;
    }

    @Override
    public int getDEF() {
        return def;
    }

    @Override
    public String getDescription() {
        return this.descripcion;
    }

}

package dosw.bitacora.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public abstract class BaseShipDecorator implements Barco {
    protected Barco ship;

    public BaseShipDecorator() {
    }

    public BaseShipDecorator(Barco ship) {
        this.ship = ship;
    }

    public void setShip(Barco ship) {
        this.ship = ship;
    }

    @Override
    public int getATK() {
        return ship.getATK();
    }

    @Override
    public int getDEF() {
        return ship.getDEF();
    }

    @Override
    public String getDescription() {
        return ship.getDescription();
    }

}

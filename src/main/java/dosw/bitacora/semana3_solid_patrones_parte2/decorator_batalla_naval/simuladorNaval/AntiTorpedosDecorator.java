package dosw.bitacora.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public class AntiTorpedosDecorator extends BaseShipDecorator {

    public AntiTorpedosDecorator(Barco ship) {
        super(ship);
    }

    @Override
    public int getATK() {
        return ship.getATK() + 20;
    }

    @Override
    public String getDescription() {
        return ship.getDescription() + " + Anti-Torpedos";
    }

}

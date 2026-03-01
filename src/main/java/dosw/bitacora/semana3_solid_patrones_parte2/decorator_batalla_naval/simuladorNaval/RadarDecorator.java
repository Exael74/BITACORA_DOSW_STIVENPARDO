package dosw.bitacora.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public class RadarDecorator extends BaseShipDecorator {

    public RadarDecorator(Barco ship) {
        super(ship);
    }

    @Override
    public int getATK() {
        return ship.getATK() + 10;
    }

    @Override
    public String getDescription() {
        return ship.getDescription() + " + Radar";
    }

}

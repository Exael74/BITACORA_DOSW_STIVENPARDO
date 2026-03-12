package dosw.bitacora.corte1.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public class BlindajeDecorator extends BaseShipDecorator {

    public BlindajeDecorator(Barco ship) {
        super(ship);
    }

    @Override
    public int getDEF() {
        return ship.getDEF() + 30;
    }

    @Override
    public String getDescription() {
        return ship.getDescription() + " + Blindaje";
    }

}


package dosw.bitacora.corte1.semana2_3.patrones.estructurales.decorator.simuladorNaval;

public class MisilesDecorator extends BaseShipDecorator {

    public MisilesDecorator(Barco ship) {
        super(ship);
    }

    @Override
    public int getATK() {
        return ship.getATK() + 40;
    }

    @Override
    public String getDescription() {
        return ship.getDescription() + " + Misiles";
    }

}


package dosw.bitacora.semana2_3.patrones.creacional.builder.toyDoll.builder;

import dosw.bitacora.semana2_3.patrones.creacional.builder.toyDoll.ToyDoll;

public class ClassicDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ClassicDollBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza clasica");
    }
    
    @Override
    public void buildBody() {
        doll.setBody("Cuerpo clasico");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos clasicos");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas clasicas");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getToyDoll() {
        return doll;
    }

}

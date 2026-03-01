package dosw.bitacora.semana2_3.patrones.creacional.builder.toyDoll.builder;

import dosw.bitacora.semana2_3.patrones.creacional.builder.toyDoll.ToyDoll;

public class ActionDollBuilder implements ToyDollBuilder{
    private ToyDoll doll;

    public ActionDollBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead(){ 
        doll.setHead("Cabeza de accion");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo de accion");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos de accion");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas de accion");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }
    
    public ToyDoll getToyDoll() {
        return doll;
    }
}

package dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll.director;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll.builder.ToyDollBuilder;

public class ToyFactory {
    private ToyDollBuilder builder;

    public ToyFactory( ToyDollBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(ToyDollBuilder builder) {
        this.builder = builder;
    }

    public void constructDoll(){
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }

}


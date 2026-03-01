package dosw.bitacora.semana2_3.patrones.creacional.builder.toyDoll.builder;

public interface ToyDollBuilder {

    void buildHead();
    void buildBody();
    void buildArms();
    void buildLegs();
    void addAccessories();
    void reset();
}

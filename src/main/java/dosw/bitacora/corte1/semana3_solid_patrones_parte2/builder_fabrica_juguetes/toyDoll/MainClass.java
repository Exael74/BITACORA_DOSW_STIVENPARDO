package dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll;

import dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll.builder.ActionDollBuilder;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll.builder.ClassicDollBuilder;
import dosw.bitacora.corte1.semana2_3.patrones.creacional.builder.toyDoll.director.ToyFactory;

public class MainClass {
    public static void main(String[] args) {
        ActionDollBuilder actionBuilder = new ActionDollBuilder();
        ClassicDollBuilder classicBuilder = new ClassicDollBuilder();

        ToyFactory factory = new ToyFactory(actionBuilder);
        
        factory.constructDoll();
        ToyDoll actionDoll = actionBuilder.getToyDoll();
        
        factory.changeBuilder(classicBuilder);
        factory.constructDoll();
        ToyDoll classicDoll = classicBuilder.getToyDoll();

        actionDoll.showInfo();
        classicDoll.showInfo();
    }
}


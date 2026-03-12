package dosw.bitacora.corte1.semana2_3.patrones.estructurales.compsite.store;

import java.util.*;

public class Box implements Component{
    private String name;
    private List<Component> components;

    public Box(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(c -> c.getPrice()).sum();
    }
}


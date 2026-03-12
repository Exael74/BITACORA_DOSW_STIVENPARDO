package dosw.bitacora.corte1.semana2_3.patrones.estructurales.compsite.store;

public class Product implements Component {
    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}


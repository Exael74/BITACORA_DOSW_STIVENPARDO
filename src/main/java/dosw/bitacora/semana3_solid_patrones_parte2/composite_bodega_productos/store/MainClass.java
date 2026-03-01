package dosw.bitacora.semana2_3.patrones.estructurales.compsite.store;

public class MainClass {

    public static void main(String[] args) {
        Component laptop = new Product("Laptop", 1200);
        Component mouse = new Product("Mouse", 40);
        Component keyboard = new Product("Keyboard", 80);

        Box box = new Box("Accessories Box");
        box.addComponent(mouse);
        box.addComponent(keyboard);

        Box mainBox = new Box("Main Box");
        mainBox.addComponent(laptop);
        mainBox.addComponent(box);

        System.out.println("Total price: " + mainBox.getPrice());
    }
}

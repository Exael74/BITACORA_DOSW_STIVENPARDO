package dosw.bitacora.semana3_solid_patrones_parte2.factory_method_comercio_electronico;

/**
 * Concrete Creator: Crea productos electrónicos
 */
public class ElectronicsCreator extends ProductCreator {
    
    @Override
    public Product createProduct() {
        return new ElectronicsProduct(
            "Smartphone Pro Max", 
            899.99, 
            "Último modelo con cámara avanzada y 5G",
            "2 años",
            "TechBrand"
        );
    }
}

/**
 * Concrete Creator: Crea productos de ropa
 */
class ClothingCreator extends ProductCreator {
    
    @Override
    public Product createProduct() {
        return new ClothingProduct(
            "Camiseta Casual Premium",
            45.99,
            "Camiseta 100% algodón orgánico de alta calidad",
            "M",
            "Algodón orgánico",
            "Azul marino"
        );
    }
}

/**
 * Concrete Creator: Crea libros
 */
class BookCreator extends ProductCreator {
    
    @Override
    public Product createProduct() {
        return new BookProduct(
            "Clean Code: Manual de desarrollo ágil de software",
            48.99,
            "Guía esencial para escribir código limpio y mantenible",
            "Robert C. Martin",
            "978-0132350884",
            464,
            "Programación"
        );
    }
}
package dosw.bitacora.corte1.semana3_solid_patrones_parte2.factory_method_comercio_electronico;

/**
 * Concrete Creator: Crea productos electrÃ³nicos
 */
public class ElectronicsCreator extends ProductCreator {
    
    @Override
    public Product createProduct() {
        return new ElectronicsProduct(
            "Smartphone Pro Max", 
            899.99, 
            "Ãšltimo modelo con cÃ¡mara avanzada y 5G",
            "2 aÃ±os",
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
            "Camiseta 100% algodÃ³n orgÃ¡nico de alta calidad",
            "M",
            "AlgodÃ³n orgÃ¡nico",
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
            "Clean Code: Manual de desarrollo Ã¡gil de software",
            48.99,
            "GuÃ­a esencial para escribir cÃ³digo limpio y mantenible",
            "Robert C. Martin",
            "978-0132350884",
            464,
            "ProgramaciÃ³n"
        );
    }
}

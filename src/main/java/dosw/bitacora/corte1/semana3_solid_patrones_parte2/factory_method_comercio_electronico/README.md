# Factory Method - Comercio Electrónico

## Descripción
Implementación del patrón Factory Method aplicado a un sistema de comercio electrónico.

## Objetivo
Crear diferentes tipos de productos sin especificar sus clases concretas, permitiendo la extensibilidad del sistema.

## Estructura
- **Product**: Interfaz común para todos los productos
- **ConcreteProduct**: Implementaciones específicas de productos
- **Creator**: Clase abstracta que declara el factory method
- **ConcreteCreator**: Implementaciones específicas del creador

## Caso de Uso
Sistema de e-commerce que maneja diferentes tipos de productos (electrónicos, ropa, libros) con características específicas.

## Archivos
- `Product.java` - Interfaz del producto
- `ElectronicProduct.java` - Producto electrónico concreto
- `ClothingProduct.java` - Producto de ropa concreto
- `BookProduct.java` - Producto libro concreto
- `ProductCreator.java` - Creator abstracto
- `ElectronicCreator.java` - Creator de electrónicos
- `Main.java` - Implementación principal
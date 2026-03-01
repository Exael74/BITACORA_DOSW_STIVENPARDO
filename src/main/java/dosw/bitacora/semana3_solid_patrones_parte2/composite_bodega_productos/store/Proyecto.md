# Proyecto: Tienda y Empaquetado (Composite)

## Descripción General
Este proyecto implementa el patrón Composite para representar un sistema de cálculo de precios en un esquema de envíos o cajas de inventario. Sirve para agrupar contenedores dentro de contenedores junto con productos individuales y tratarlos de la misma manera calculando su valor unificado.

## Flujo de Funcionamiento
1. **El Componente Base (`Component`):** Una interfaz que agrupa el comportamiento común (en este caso obtener el precio base de lo que hay en sí mismo, `getPrice()`).
2. **La Hoja / Artículo Simple (`Product`):** Extiende a `Component`. Representa un artículo que ya no se divide y que simplemente posee un nombre y un precio fijo (`Laptop`, `Mouse`, `Keyboard`).
3. **El Compuesto (`Box`):** Extiende a `Component` pero contiene una lista interna de otros `Component` (sean otros `Box` o `Product`s). Al llamarse su método `getPrice()`, iterará de manera recursiva por todos sus hijos sumando el precio total.
4. **Ejecución (`MainClass`):** 
   - Se instancian tres productos y una caja chica (`Accessories Box`) donde van el mouse y el teclado.
   - Todo eso, junto con una laptop, se mete en una caja más grande (`Main Box`).
   - El cliente solo le pregunta a la `Main Box` cuál es su `getPrice()`, y el árbol entero iterará automáticamente para devolver el valor agregado ($1320), sin que el cliente diferencie entre objetos unitarios o cajas complejas.

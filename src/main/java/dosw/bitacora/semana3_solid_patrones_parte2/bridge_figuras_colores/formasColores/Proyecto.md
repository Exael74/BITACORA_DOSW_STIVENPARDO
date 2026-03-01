# Proyecto: Formas y Colores (Bridge)

## Descripción General
Este proyecto demuestra cómo el patrón Bridge soluciona la variante exponencial de crear una subclase por cada tipo de forma combinada con cada tipo de color (ej. `RedCircle`, `BlueCircle`, `RedSquare`, `BlueSquare`). Aquí, simplemente se conecta la abstracción "Forma" (`Shape`) a la implementación "Color".

## Flujo de Funcionamiento
1. **Implementación de Comportamiento:** Se tiene una interfaz base para definir comportamientos relacionados con el color (ej. pintar algo de color Rojo o Azul). Están las clases concretas `Red` y `Blue`.
2. **La Abstracción (Shape):** `Shape` es una clase abstracta o interfaz que asume el rol de abstracción primaria. Contiene una referencia a la interfaz del color elegida y espera que las clases hijas se ocupen de la lógica real.
3. **Las Formas Concretas:**
   - `Circle`: Una forma circular. En su constructor recibe un color específico.
   - `Square`: Una forma cuadrada. Igual recibe un color.
4. **Ejecución (`MainClass`):**
   - El cliente enlaza ambos conceptos dinámicamente: `new Circle(new Red())` y `new Square(new Blue())`.
   - Cuando se manda a dibujar una de las formas (`redCircle.draw()`), el flujo del programa se delega desde la Forma al componente Color internamente insertado para mostrar ambos atributos, logrando total flexibilidad al agregar más formas o más colores sin crear nuevas clases acopladas.

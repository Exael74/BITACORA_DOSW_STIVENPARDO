# Proyecto: Videojuegos (Abstract Factory)

## Descripción General
Este proyecto implementa el patrón Abstract Factory para la creación de consolas y motores de videojuegos. El objetivo principal es poder inicializar un entorno de juego (`GameEnginee`) ya sea para una consola PlayStation o para una Xbox sin acoplar el núcleo del motor gráfico a clases concretas específicas de la plataforma.

## Flujo de Funcionamiento
1. **Fábrica Base:** Existe una interfaz abstracta `ConsoleFactory` que define los métodos necesarios para crear los accesorios o partes de la consola (controles, tarjetas de memoria, etc.).
2. **Fábricas Concretas:**
   - `PlayStationFactory`: Produce los componentes diseñados para PlayStation.
   - `XboxFactory`: Produce componentes diseñados para Xbox.
3. **El Motor Gráfico (`GameEnginee`):** El motor no conoce de qué marca es la consola. Simplemente recibe una `ConsoleFactory` en su inicialización. Al correrse (`run()`), el motor solicita a la fábrica todos sus componentes y ejecuta el entorno gráfico de la misma forma para cualquier consola.
4. **Ejecución (`MainClass`):** El cliente instancia un `GameEnginee` inyecándole una `PlayStationFactory` y luego lo ejecuta. Más tarde, cambia a una `XboxFactory` y vuelve a instanciar y ejecutar el juego, demostrando que un mismo motor soporta distintas familias de objetos con solo intercambiar la fábrica.

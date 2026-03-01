# Proyecto: Rutas de Navegación (Strategy)

## Descripción General
Este proyecto hace uso del patrón Strategy para implementar una aplicación de navegación GPS (`NavigationApp`). Dependiendo de las preferencias o necesidades del usuario en tiempo real (por ejemplo, buscar la ruta más rápida, la más barata o la más panorámica), el algoritmo de cálculo de rutas cambia internamente sin tener que alterar el código principal de la aplicación.

## Flujo de Funcionamiento
1. **La Interfaz de Estrategia (`RouteStrategy`):** Una interfaz fundamental que declara un único método: `buildRoute(String A, String B)`.
2. **Las Estrategias Concretas:**
   - `CheapestRoute`: Implementa un algoritmo asilado para buscar rutas que impliquen menor gasto (evitando peajes, menos consumo de gasolina).
   - `FasterRoute`: Algoritmo enfocado en el ahorro de tiempo, seleccionando autopistas y limitando semáforos.
   - `ScenicRoute`: Algoritmo que prefiere vías visualmente atractivas o turísticas.
3. **El Contexto (`NavigationApp`):** Es la clase contenedora que el usuario opera directamente. Posee un atributo o referencia de tipo `RouteStrategy` que puede ser inicializado o manipulado mediante un método `setRouteStrategy(...)`. Su ejecución (`startNavigation()`) en lugar de hacer complejos ifs, delega la tarea a `strategy.buildRoute(...)`.
4. **Ejecución (`MainClass`):**
   - El cliente inicializa la app con la estrategia `FasterRoute` e inicia la navegación (la app imprimirá que usa la ruta más rápida).
   - Más tarde, en la misma ejecución, el usuario en los ajustes cambia a una ruta escénica y presiona nuevamente Iniciar. La app invoca `app.setRouteStrategy(new ScenicRoute())` y el mismo método de ejecución ahora arroja un cálculo completamente diferente.
   - Finalmente, cambia su preferencia a la ruta más barata de nuevo con `app.setRouteStrategy(new CheapestRoute())`, demostrando que el código base de la app interactúa de forma genérica con las estrategias.

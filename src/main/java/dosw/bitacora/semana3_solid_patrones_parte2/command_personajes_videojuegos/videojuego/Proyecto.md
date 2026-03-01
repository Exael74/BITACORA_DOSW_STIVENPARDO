# Proyecto: Controles de Videojuego (Command)

## Descripción General
Este proyecto hace uso del patrón Command para gestionar las acciones y movimientos de un personaje en un videojuego (`GameCharacter`). Encapsula cada solicitud de acción como un objeto, permitiendo parametrizar otras clases con esas acciones y encolarlas fácilmente.

## Flujo de Funcionamiento
1. **El Receptor (`GameCharacter`):** Es la clase que contiene la verdadera lógica de negocio "física". Sabe cómo saltar, caminar, atacar y defender.
2. **El Comando (`Command`):** Representa una interfaz base con un método `execute()`.
3. **Comandos Concretos:** Se tienen clases como `WalkCommand`, `JumpCommand`, `AttackCommand`, y `DefendCommand`, las cuales implementan `Command`. En su constructor reciben una instancia del receptor (`GameCharacter`) y en su método `execute()` llaman a la acción respectiva.
4. **El Invocador (`GameController`):** Es el gamepad o administrador lógico que ejecuta la acción solicitada cuando el cliente "presiona un botón" (`pressButton(Command)`). No conoce el contenido del comando.
5. **Ejecución (`MainClass`):** Se crea el receptor y el control. Luego se genera una lista (secuencia) de comandos específicos (Caminar, Saltar, Atacar, Defender). Se repasa iterativamente la lista mandando al controlador a ejecutar cada comando de manera encolada.

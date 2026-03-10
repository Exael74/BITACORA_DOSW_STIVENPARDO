# Proyecto: Sistema de Migración (Chain of Responsibility)

## Descripción General
Este proyecto hace uso del patrón Cadena de Responsabilidad para crear un sistema escalonado de validaciones y controles migratorios. En vez de utilizar un único y masivo condicional de validación, se enrutan las solicitudes (`Request` con información de perfil) a través de filtros en serie.

## Flujo de Funcionamiento
1. **El Objeto de Petición (`Request`):** Es el objeto que contiene toda la información de la persona solicitante sujeta a validación (si tiene pasaporte, sus antecedentes, y de qué trata su motivo de viaje).
2. **La Cadena (Handlers/Manejadores):** Se crea una clase abstracta `ControlMigratorio` (o un Handler) que tiene la capacidad de enlazar una referencia al *siguiente* control de la cadena (`setNext()`).
3. **Eslabones (Los Controles Concretos):**
   - `PasaporteControl`: Valida que el pasaporte sea legal o esté vigente antes de continuar.
   - `AntecedentesControl`: Valida que el sujeto no ostente antecedentes penales.
   - `MotivoViajeControl`: Revisa la veracidad y validez del motivo aportado por el sujeto.
   - `AprobacioFinalControl`: El último filtro; ratifica y emite el resultado satisfactorio.
4. **Ejecución (`MainClass`):**
   - El cliente enlaza los eslabones: `Pasaporte` apunta a `Antecedentes`, éste a `Motivo` y éste a `Aprobación`.
   - El cliente crea una solicitud (p.ej. con antecedentes dudosos) y se la entrega al primer eslabón (`pasaporte.procesar(persona)`).
   - Internamente, si el control aprueba el requerimiento llama a `next.procesar(persona)`. En caso de encontrar algo inválido retorna el fin al cliente (por ejemplo, "Rechazo por falta de pasaporte").

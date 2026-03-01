# Documento de Análisis de Requisitos

**Proyecto:** Módulo de Inscripción Web - Escuela Colombiana de Ingeniería  
**Contexto:** Asignatura Desarrollo de Software (Semana 4)

---

## 1. Requerimientos Funcionales (RF)

| ID | Nombre | Descripción |
|---|---|---|
| **RF-01** | **Gestión de Formulario** | El sistema habilitará un formulario web para que los aspirantes registren sus datos. |
| **RF-02** | **Validación de Datos** | El sistema comprobará la completitud y el formato correcto de la información. |
| **RF-03** | **Notificación de Éxito** | Tras una inscripción válida, el sistema despachará automáticamente un correo electrónico. |
| **RF-04** | **Panel de Administración** | Los administradores podrán acceder a una interfaz para buscar, filtrar y descargar (Exportar). |
| **RF-05** | **Carga de Anexos** | El aspirante deberá poder subir sus documentos soporte durante la misma sesión de inscripción. |

---

## 2. Requerimientos No Funcionales (RNF)

| ID | Categoría | Descripción |
|---|---|---|
| **RNF-01** | **Rendimiento** | El tiempo de respuesta del servidor al enviar el formulario no debe sobrepasar los 2 segundos. |
| **RNF-02** | **Disponibilidad** | Durante las fechas de convocatoria, la plataforma web garantizará un uptime del 99.5%. |
| **RNF-03** | **Seguridad** | Toda información transmitida estará protegida bajo protocolos TLS/HTTPS y los anexos cifrados. |
| **RNF-04** | **Usabilidad/UI** | El formulario contará con un diseño responsivo, adaptable a múltiples pantallas. |

---

## 3. Especificación Detallada de RFs

### RF-01
- **Nombre:** Gestión de Formulario (Diligenciar y enviar)
- **Descripcion:** El sistema habilitará un formulario web para que los aspirantes registren sus datos personales y académicos para inscribirse a una carrera de forma oficial.
- **Como se ejecutara:** A través de un formulario HTML5/JavaScript en el navegador, con validación reactiva que envía mediante HTTP POST.
- **Actor Principal:** Aspirante
- **Precondiciones:** Convocatorias abiertas y el usuario debe tener un documento de identidad válido y conexión a internet estable.
- **Datos de entrada y de salida:**
  - *Entrada:* Datos personales (Nombres, Documento, Fecha Nacimiento, Correo, Teléfono), Selección de carrera, Modalidad.
  - *Salida:* Pantalla de confirmación, Número único de radicado asignado y envío de alerta SMTP.
- **Flujo Basico:**
  1. El usuario navega a la sección de "Inscripciones a Programas de Pregrado/Posgrado".
  2. Llena de forma manual sus datos personales y selecciona la carrera objetivo.
  3. Adjunta los documentos correspondientes en el componente de carga.
  4. Presiona el botón de confirmación "Enviar Inscripción".
  5. El sistema emite un código/número de radicado y almacena la postulación en la base de datos.
- **Flujo Alterno (Error):**
  - Si el usuario ya está registrado en la base de datos con su número de documento en este semestre: el sistema muestra mensaje de alerta (`"Ya cuenta con una inscripción activa"`) y le bloquea el re-intento.
  - Si ocurre un timeout en la red al enviar, se conservan los datos llenos del formulario pero con la alerta `"Fallo de red, intente de nuevo."`
- **Diagrama de casos de Uso:**
  ```mermaid
  usecaseDiagram
    actor Aspirante as A
    rectangle "Sistema de Inscripciones" {
      usecase "Diligenciar e Inscribir" as UI
    }
    A --> UI
  ```
- **Reglas de negocio:**
  - Una única inscripción por documento de identidad de aspirante dentro de un mismo período académico (semestre).
  - Solo se muestran carreras que configuren cupos vigentes.

---

### RF-02
- **Nombre:** Validación de Datos
- **Descripcion:** El sistema comprobará exhaustivamente la completitud y el formato correcto de la información en todos los campos obligatorios antes de permitir procesar cualquier solicitud.
- **Como se ejecutara:** En cascada; primero en el cliente (navegador con scripts) previniendo envío, y finalmente en el servidor controlando la seguridad (Backend Endpoint).
- **Actor Principal:** Sistema (Validación Automática)
- **Precondiciones:** El usuario ha modificado los valores iniciales y pulsado "Enviar".
- **Datos de entrada y de salida:**
  - *Entrada:* Toda la sumatoria de inputs del formulario y los blobs (archivos).
  - *Salida:* Mensajes UI de validación ok o Lista detallada de fallas (Errores visuales sobre el input en rojo).
- **Flujo Basico:**
  1. El cliente intercepta el click en "Enviar".
  2. Todos los inputs son cotejados contra expresiones regulares y chequeos de nulidad.
  3. Si es exitoso, pasa al servidor.
  4. El servidor re-chequea e inserta datos validados.
- **Flujo Alterno (Error):**
  - Si se envían strings mal formados en el correo, la UI pinta borde rojo en el input (`"Correo no corresponde a formato"`).
  - Si algún listado de tipo archivo indica extensiones raras (e.g. .exe), bloquea.
- **Diagrama de casos de Uso:**
  ```mermaid
  usecaseDiagram
    actor Sistema as S
    rectangle "Lógica" {
      usecase "Validar Campos y Extensión" as VF
    }
    S --> VF
  ```
- **Reglas de negocio:**
  - Las cédulas numéricas deben ser > 5 dígitos.
  - El tel. debe conformar una lógica real (ej: 10 dígitos numéricos celulares nacionales).

---

### RF-03
- **Nombre:** Notificación de Éxito
- **Descripcion:** Tras una inscripción válida y confirmada en la DB, el sistema despacha automáticamente un correo corporativo al aspirante con toda su data de confirmación.
- **Como se ejecutara:** Un Worker / Listener secundario asíncrono que escucha el evento "NuevaInscripcion" e interactúa con el servidor de correo institucional (SMTP o API SendGrid/AWS SES).
- **Actor Principal:** Servicio Transaccional / Sistema
- **Precondiciones:** La transacción SQL de `Aspirante` fue commiteada sin errores y se extrajo el id/radicado.
- **Datos de entrada y de salida:**
  - *Entrada:* ID Radicado, email del estudiante, carrera electa, timestamp.
  - *Salida:* Despacho del protocolo en red, generando recepción en el inbox del estudiante.
- **Flujo Basico:**
  1. Se confirma el registro de la persona en la base de datos principal.
  2. El sistema empaca datos JSON con un template HTML.
  3. Se conecta al canal SMTP con el email del usuario como destino.
  4. El correo se marca en bitácora interna como status `Enviado`.
- **Flujo Alterno (Error):**
  - Si el servidor de correos excede tiempo o rechaza la conexión, el task runner asincrónico se suspende y reagrupa su mensaje enviándolo en lotes cada 5 min.
  - Si el target_email "rebota" duro (permanente), queda logueado como incidente (Bounce) en el monitor de salud del admin, para contacto posterior manual.
- **Diagrama de casos de Uso:**
  ```mermaid
  usecaseDiagram
    actor "Mail Service" as MS
    rectangle "Notificador" {
      usecase "Despachar Correo de Registro" as CR
    }
    MS --> CR
  ```
- **Reglas de negocio:**
  - SLA de notificación: El estudiante no puede esperar más de 30 minutos sin email.
  - Formato homologado según directrices de marketing (No spam score).

---

### RF-04
- **Nombre:** Panel de Administración (Exportar Info)
- **Descripcion:** Los administradores académicos podrán acceder a una interfaz privilegiada para buscar, filtrar y descargar en múltiples hojas de cálculo el padrón total de los aspirantes inscritos.
- **Como se ejecutara:** Una tabla interactiva de DataGrid en una vista protegida, impulsada por endpoints backend con sentencias SQL de exportación / conversión hacia formato CSV/Excellice.
- **Actor Principal:** Administrador Académico
- **Precondiciones:** Poseer credenciales activas del directorio activo (SSO) con rol ADMIN_INSCRIPCIONES.
- **Datos de entrada y de salida:**
  - *Entrada:* Parámetros de filtros (rango de meses, selector de carreras, busqueda texto de cédula).
  - *Salida:* Archivo físico `.xlsx` descargado por el navegador con layout tabulado de las inscripciones filtradas.
- **Flujo Basico:**
  1. Login exitoso usando sus credenciales seguras.
  2. Navega a `Dashboard > Lista General de Inscritos`.
  3. Ejecuta filtros temporales del último trimestre.
  4. Observa el count en el frontend que avala "150 registros".
  5. Aprieta: "Generar Matriz (.xlsx)". El backend compone el archivo y entrega a descargas.
- **Flujo Alterno (Error):**
  - Timeout de generación si el reporte excede 50,000 filas: en ese caso se emite una ventana de progreso en 2º plano recomendando volver después o se despacha el xlsx al propio email del Admin (`"Reporte pesado, será enviado..."`).
- **Diagrama de casos de Uso:**
  ```mermaid
  usecaseDiagram
    actor Administrador as AA
    rectangle "Panel de Control" {
      usecase "Aplicar Filtros" as F
      usecase "Importar/Exportar XLS" as E
    }
    AA --> F
    AA --> E
  ```
- **Reglas de negocio:**
  - Datos sensibles en exportación deben tratarse como confidenciales (Ley de Datos Personales o equivalente).
  - Ningún admin tiene permiso `delete` (eliminar); el tracking historizado no puede amputarse.

---

### RF-05
- **Nombre:** Carga de Anexos
- **Descripcion:** El sistema deberá poder proveer slots de adjuntos al usuario para cargar documentación fehaciente obligatoria.
- **Como se ejecutara:** Sub-componente del formulario que convierte blobs a Data-Binary, subiéndolos a un Storage Object AWS S3 o carpeta con alias UUID cifrados.
- **Actor Principal:** Aspirante
- **Precondiciones:** Archivos alojados y decodificables en disco duro / móvil del usuario local.
- **Datos de entrada y de salida:**
  - *Entrada:* Un archivo de PDF o imagen estática.
  - *Salida:* Un Check verde de UI para el cliente y un token URL (Key de Storage) referenciando el path del upload en backend.
- **Flujo Basico:**
  1. Cliente clickea en la caja de carga.
  2. Selecciona "documento_santiago.pdf".
  3. Visualiza barrita de porcentaje de subida.
  4. Finaliza: ve metadata (nombre, tamaño y check).
- **Flujo Alterno (Error):**
  - Si carga un `archivo.jpeg` de 22 Megabytes, el interceptor JS frontal arroja error modal rojo: `"Límite superado. El máximo son 5 MB"` y bloquea la operación.
  - Al caer la red mitad de camino, la barra subida queda colgada, abortándose la petición con notificación general de timeout global al cliente.
- **Diagrama de casos de Uso:**
  ```mermaid
  usecaseDiagram
    actor Aspirante as A
    rectangle "Uploader FileSystem" {
      usecase "Adjuntar PDF de Titulo" as UP
    }
    A --> UP
  ```
- **Reglas de negocio:**
  - Máxima capacidad: 3 anexos (Cédula, Diploma, Foto carnet).
  - Todo upload que desate virus es truncado por gateway antivirus antes de insertarse en discos en la nube.

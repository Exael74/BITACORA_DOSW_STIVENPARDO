# Ejercicio 3: Sistema de Reportes de una Plataforma

## Patrones Utilizados

1. **Builder**
   - **Tipo de Patrón:** Creacional
   - **Justificación Técnica:** El proceso de crear un reporte puede ser complejo e involucrar múltiples pasos (encabezado, cuerpo, pie de página). Aplicando el patrón Builder (`ReportBuilder` y sus implementaciones concretas PDF, CSV, JSON) podemos construir estos reportes paso a paso aislando la lógica de ensamblado. Además, el `ReportDirector` nos permite orquestar esta lógica y construir diferentes variantes del reporte usando el mismo código de construcción sin importar el formato (representación) final.

2. **Decorator**
   - **Tipo de Patrón:** Estructural
   - **Justificación Técnica:** Los reportes requieren extender su funcionalidad (su representación final en texto o bytes) en tiempo de ejecución, permitiendo composiciones arbitarias sin recurrir a una explosión de herencias, ejemplo: un reporte con firma, o un reporte con firma y marca de agua, o un reporte comprimido y firmado. El patrón Decorator nos permite "envolver" (`ReportDecorator`) el objeto Report original para ir agregando estas modificaciones/extensiones independientemente del formato original del reporte (PDF, CSV o JSON).

---

Ver diagrama de clases en `diagrama.puml`.

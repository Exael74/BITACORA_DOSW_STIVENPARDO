# Ejercicio 1: Sistema de Notificaciones

## Patrones Utilizados

1. **Singleton**
   - **Tipo de Patrón:** Creacional
   - **Justificación Técnica:** Se garantiza que el servicio de envío (`NotificationService`) exista una sola vez en todo el sistema (una única instancia compartida), evitando instanciar múltiples gestores de envío. Esto centraliza la configuración, ahorra memoria y simplifica el acceso global al servicio.

2. **Strategy**
   - **Tipo de Patrón:** Comportamiento
   - **Justificación Técnica:** Permite cambiar dinámicamente el comportamiento (algoritmo) de envío sin modificar el cliente que lo usa. Se define una interfaz `NotificationStrategy` y múltiples implementaciones (Email, SMS, Push). Esto cumple con el principio Open/Closed, ya que podemos agregar nuevos tipos de notificaciones (ej. WhatsApp) creando nuevas clases sin alterar el servicio base.

---

Ver diagrama de clases en `diagrama.puml`.

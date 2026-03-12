# Ejercicio 2: Sistema de Procesamiento de Pagos

## Patrones Utilizados

1. **Adapter (Adaptador)**
   - **Tipo de Patrón:** Estructural
   - **Justificación Técnica:** El sistema requiere integrarse con múltiples plataformas de pago externas (PayPal, Stripe) que exponen interfaces (APIs) diferentes e incompatibles con la interfaz que espera nuestro servicio (`PaymentProcessor`). A través del patrón Adapter, envolvemos estas clases externas (`PayPalAPI`, `StripeAPI`) estandarizando sus métodos bajo el mismo contrato (`processPayment`), permitiendo así agregar nuevos proveedores a futuro (ej. Apple Pay) de manera transparente para el cliente (`PaymentService`).

2. **Chain of Responsibility (Cadena de Responsabilidad)**
   - **Tipo de Patrón:** Comportamiento
   - **Justificación Técnica:** Permite definir una serie de validaciones (ej. saldo, fraude, límite de transacciones) como eslabones de una cadena (`ValidationHandler`). Cada eslabón tiene la responsabilidad de validar la lógica que le corresponde y, si todo está bien, pasar la petición al siguiente validador. El proceso de pago central solo interactúa con la cabeza de la cadena y no necesita conocer cada regla de negocio, lo que facilita agregar, quitar o reordenar validaciones dinámicamente sin afectar el código principal de `PaymentService`.

---

Ver diagrama de clases en `diagrama.puml`.

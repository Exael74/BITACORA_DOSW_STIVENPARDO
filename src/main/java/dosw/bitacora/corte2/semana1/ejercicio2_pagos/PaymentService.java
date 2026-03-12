package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class PaymentService {
    private PaymentProcessor paymentProcessor;
    private ValidationHandler validationChain;

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void setValidationChain(ValidationHandler validationChain) {
        this.validationChain = validationChain;
    }

    public boolean process(String accountId, double amount) {
        if (paymentProcessor == null) {
            throw new IllegalStateException("Payment Processor no configurado.");
        }

        // Ejecutar las validaciones si existe alguna configurada
        if (validationChain != null) {
            boolean isValid = validationChain.validate(accountId, amount);
            if (!isValid) {
                System.out.println("Pago de $" + amount + " rechazado por las validaciones.");
                return false;
            }
        }

        // Si pasa todas las validaciones (o no hay cadena), procesar pago a través del adaptador
        paymentProcessor.processPayment(amount);
        return true;
    }
}

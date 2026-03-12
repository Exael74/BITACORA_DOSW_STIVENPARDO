package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class CreditCardAdapter implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago de $" + amount + " con Tarjeta de Crédito interna.");
    }
}

package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class BankTransferAdapter implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago de $" + amount + " con Transferencia Bancaria interna.");
    }
}

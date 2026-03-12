package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalAPI paypalAPI;

    public PayPalAdapter() {
        this.paypalAPI = new PayPalAPI();
    }

    @Override
    public void processPayment(double amount) {
        paypalAPI.sendPayment(amount);
    }
}

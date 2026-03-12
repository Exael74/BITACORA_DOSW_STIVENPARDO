package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class StripeAdapter implements PaymentProcessor {
    private StripeAPI stripeAPI;

    public StripeAdapter() {
        this.stripeAPI = new StripeAPI();
    }

    @Override
    public void processPayment(double amount) {
        stripeAPI.makeCharge(amount);
    }
}

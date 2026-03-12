package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class FraudValidation extends ValidationHandler {
    @Override
    public boolean validate(String accountId, double amount) {
        // Simulamos regla de fraude
        if (amount > 100000) {
            System.out.println("Posible fraude detectado por monto muy alto para " + accountId);
            return false;
        }
        System.out.println("Validación de fraude aprobada.");
        return checkNext(accountId, amount);
    }
}

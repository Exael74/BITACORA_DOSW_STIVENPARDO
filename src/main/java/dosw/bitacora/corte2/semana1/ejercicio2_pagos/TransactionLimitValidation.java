package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class TransactionLimitValidation extends ValidationHandler {
    @Override
    public boolean validate(String accountId, double amount) {
        // Simular validación del límite diario
        if (amount > 5000) {
            System.out.println("Límite de transacciones diario superado para " + accountId);
            return false;
        }
        System.out.println("Validación de límite de transacciones aprobada.");
        return checkNext(accountId, amount);
    }
}

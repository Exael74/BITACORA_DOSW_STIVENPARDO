package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public class BalanceValidation extends ValidationHandler {
    @Override
    public boolean validate(String accountId, double amount) {
        // Lógica simulada de base de datos o servicio externo
        if (amount <= 0) {
            System.out.println("Saldo inválido para " + accountId);
            return false;
        }
        System.out.println("Validación de saldo en cuenta " + accountId + " aprobada.");
        return checkNext(accountId, amount);
    }
}

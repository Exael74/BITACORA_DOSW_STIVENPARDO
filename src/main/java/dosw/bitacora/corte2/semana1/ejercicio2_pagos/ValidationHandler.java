package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

public abstract class ValidationHandler {
    protected ValidationHandler next;

    public void setNext(ValidationHandler next) {
        this.next = next;
    }

    public abstract boolean validate(String accountId, double amount);

    protected boolean checkNext(String accountId, double amount) {
        if (next == null) {
            return true;
        }
        return next.validate(accountId, amount);
    }
}

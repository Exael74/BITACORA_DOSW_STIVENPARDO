package dosw.bitacora.corte2.semana1.ejercicio2_pagos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    private PaymentService service;
    private ValidationHandler chain;

    @BeforeEach
    public void setup() {
        service = new PaymentService();

        // Configuración de la cadena
        ValidationHandler balance = new BalanceValidation();
        ValidationHandler fraud = new FraudValidation();
        ValidationHandler limit = new TransactionLimitValidation();

        balance.setNext(fraud);
        fraud.setNext(limit);
        
        chain = balance;
        service.setValidationChain(chain);
    }

    @Test
    public void testValidPaymentWithStripe() {
        service.setPaymentProcessor(new StripeAdapter());
        
        // Un pago de 100 con Stripe que cumple todas las condiciones (amount > 0, < 100k, < 5k)
        boolean result = service.process("USER_123", 1500.0);
        assertTrue(result, "El pago debe ser procesado exitosamente.");
    }

    @Test
    public void testValidPaymentWithPayPal() {
        service.setPaymentProcessor(new PayPalAdapter());
        // Un pago de 50 con PayPal
        boolean result = service.process("USER_456", 50.0);
        assertTrue(result, "El pago debe ser procesado exitosamente.");
    }

    @Test
    public void testBalanceValidationFailure() {
        service.setPaymentProcessor(new CreditCardAdapter());
        // Monto negativo
        boolean result = service.process("USER_789", -10.0);
        assertFalse(result, "El pago debe ser rechazado por balance insuficiente.");
    }

    @Test
    public void testFraudValidationFailure() {
        service.setPaymentProcessor(new BankTransferAdapter());
        // Monto mayor a 100k
        boolean result = service.process("USER_HACKER", 150000.0);
        assertFalse(result, "El pago debe ser rechazado por posible fraude.");
    }

    @Test
    public void testLimitValidationFailure() {
        service.setPaymentProcessor(new BankTransferAdapter());
        // Monto entre 5k y 100k
        boolean result = service.process("USER_VIP", 10000.0);
        assertFalse(result, "El pago debe ser rechazado por el límite de transacciones diario.");
    }
}

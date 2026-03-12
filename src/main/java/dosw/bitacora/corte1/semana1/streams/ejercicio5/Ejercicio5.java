package dosw.bitacora.corte1.semana1.streams.ejercicio5;

import java.util.Arrays;
import java.util.List;

class Transaccion {
    private String id;
    private double monto;
    private String estado;

    public Transaccion(String id, double monto, String estado) {
        this.id = id;
        this.monto = monto;
        this.estado = estado;
    }

    public double getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id='" + id + '\'' + ", monto=" + monto + ", estado='" + estado + '\'' + '}';
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Transaccion> transacciones = Arrays.asList(
                new Transaccion("T1", 500.0, "COMPLETADA"),
                new Transaccion("T2", 15000.0, "PENDIENTE"),
                new Transaccion("T3", 200.0, "COMPLETADA"),
                new Transaccion("T4", 12000.0, "RECHAZADA"),
                new Transaccion("T5", 1000.0, "PENDIENTE"));

        // Procesamiento: peek para monitorear y anyMatch para validar si hay alguna
        // transacciÃ³n grande pendiente
        System.out.println("--- Monitoreo de Transacciones Pendientes ---");
        boolean hayTransaccionFuertePendiente = transacciones.stream()
                .filter(t -> t.getEstado().equals("PENDIENTE"))
                .peek(t -> System.out.println("Analizando transaccion pendiente: " + t))
                .anyMatch(t -> t.getMonto() > 10000.0);

        System.out.println("\nÂ¿Hay alguna transacciÃ³n pendiente por mÃ¡s de 10,000 USD?: "
                + (hayTransaccionFuertePendiente ? "SÃ" : "NO"));
    }
}


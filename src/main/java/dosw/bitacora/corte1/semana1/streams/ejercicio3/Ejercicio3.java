package dosw.bitacora.corte1.semana1.streams.ejercicio3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Empleado {
    private String nombreCompleto;
    private boolean estaActivo;

    public Empleado(String nombreCompleto, boolean estaActivo) {
        this.nombreCompleto = nombreCompleto;
        this.estaActivo = estaActivo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        // Datos de entrada originales
        List<Empleado> plantilla = Arrays.asList(
                new Empleado("Ana Rojas", true),
                new Empleado("Luis Perez", false),
                new Empleado("Carlos Gomez", true),
                new Empleado("Maria Silva", false),
                new Empleado("Pedro pineda", true));

        // Procesamiento: Filtrar empleados activos y mapear a sus nombres
        List<String> nombresActivos = plantilla.stream()
                .filter(Empleado::isEstaActivo)
                .map(Empleado::getNombreCompleto)
                .collect(Collectors.toList());

        // Salida
        System.out.println("Nombres de empleados activos: " + nombresActivos);
    }
}


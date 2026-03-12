package dosw.bitacora.corte1.semana1.streams.ejercicio4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " aÃ±os)";
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        // Datos originales
        List<Persona> grupo = Arrays.asList(
                new Persona("Andres", 15),
                new Persona("Sofia", 22),
                new Persona("Camila", 17),
                new Persona("Jorge", 30),
                new Persona("Santiago", 18));

        // Procesamiento: Filtrar mayores de edad (>= 18)
        List<Persona> mayoresDeEdad = grupo.stream()
                .filter(p -> p.getEdad() >= 18)
                .collect(Collectors.toList());

        // Salida
        System.out.println("Grupo completo: " + grupo);
        System.out.println("Personas mayores de edad: " + mayoresDeEdad);
    }
}


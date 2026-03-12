package dosw.bitacora.corte1.semana1.streams.ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) {
        // Datos de entrada (diferentes a los de Pineda)
        List<Integer> calificaciones = Arrays.asList(4, 9, 12, 15, 6, 22, 11, 8, 30);

        // Procesamiento: Filtrar pares mayores a 10
        List<Integer> calificacionesFiltradas = calificaciones.stream()
                .filter(nota -> nota % 2 == 0) // Es par
                .filter(nota -> nota > 10) // Es mayor a 10
                .collect(Collectors.toList());

        // Salida
        System.out.println("Calificaciones originales: " + calificaciones);
        System.out.println("Calificaciones pares y mayores a 10: " + calificacionesFiltradas);
    }
}


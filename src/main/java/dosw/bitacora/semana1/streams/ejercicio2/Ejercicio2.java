package dosw.bitacora.semana1.streams.ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Datos de entrada originales
        List<String> frutas = Arrays.asList("uva", "manzana", "pera", "kiwi", "mandarina", "mora", "sandia");

        // Procesamiento: palabras con más de 4 letras, a mayúsculas, y ordenadas
        // alfabéticamente
        List<String> frutasProcesadas = frutas.stream()
                .filter(fruta -> fruta.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        // Salida
        System.out.println("Frutas originales: " + frutas);
        System.out.println("Frutas procesadas (> 4 letras, mayúsculas, ordenadas): " + frutasProcesadas);
    }
}

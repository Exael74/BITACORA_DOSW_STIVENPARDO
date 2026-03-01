package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio4_solid_calculadora;

public class GestorCalculadora {
    // Inyección de dependencias (Cumple DIP y Open/Closed)
    public double calcular(OperacionAritmetica operacion, double a, double b) {
        return operacion.ejecutar(a, b);
    }
}

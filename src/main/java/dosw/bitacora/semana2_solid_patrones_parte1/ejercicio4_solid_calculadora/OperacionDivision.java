package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio4_solid_calculadora;

public class OperacionDivision implements OperacionAritmetica {
    @Override
    public double ejecutar(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return numero1 / numero2;
    }
}

package dosw.bitacora.semana2_solid_patrones_parte1.ejercicio4_solid_calculadora;

public class OperacionSuma implements OperacionAritmetica {
    @Override
    public double ejecutar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}

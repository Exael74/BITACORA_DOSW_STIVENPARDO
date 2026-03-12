package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio4_solid_calculadora;

public class OperacionResta implements OperacionAritmetica {
    @Override
    public double ejecutar(double numero1, double numero2) {
        return numero1 - numero2;
    }
}


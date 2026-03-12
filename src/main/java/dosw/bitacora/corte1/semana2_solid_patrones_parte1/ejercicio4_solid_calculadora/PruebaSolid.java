package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio4_solid_calculadora;

public class PruebaSolid {
    public static void main(String[] args) {
        System.out.println("--- Prueba Principios SOLID: Calculadora ---");

        GestorCalculadora calculadora = new GestorCalculadora();

        double n1 = 20.0;
        double n2 = 5.0;

        double resultadoSuma = calculadora.calcular(new OperacionSuma(), n1, n2);
        System.out.println("Suma: " + n1 + " + " + n2 + " = " + resultadoSuma);

        double resultadoResta = calculadora.calcular(new OperacionResta(), n1, n2);
        System.out.println("Resta: " + n1 + " - " + n2 + " = " + resultadoResta);

        double resultadoMult = calculadora.calcular(new OperacionMultiplicacion(), n1, n2);
        System.out.println("Multiplicacion: " + n1 + " * " + n2 + " = " + resultadoMult);

        double resultadoDiv = calculadora.calcular(new OperacionDivision(), n1, n2);
        System.out.println("Division: " + n1 + " / " + n2 + " = " + resultadoDiv);
    }
}


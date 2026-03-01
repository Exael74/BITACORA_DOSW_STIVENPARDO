package dosw.bitacora.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public class MainClass {

    public static void main(String[] args) {
        
        ControlMigratorio pasaporte = new PasaporteControl();
        ControlMigratorio antecedentes = new AntecedentesControl();
        ControlMigratorio motivo = new MotivoViajeControl();
        ControlMigratorio aprobacion = new AprobacioFinalControl();

        pasaporte.setNext(antecedentes);
        antecedentes.setNext(motivo);
        motivo.setNext(aprobacion);

        Request persona = new Request(
            true,
            true,
            false
        );

        System.out.println("Resultado del proceso de migración: " + pasaporte.procesar(persona));

        persona = new Request(
            true,
            true,
            true
        );

        System.out.println("Resultado del proceso de migración: " + pasaporte.procesar(persona));

        persona = new Request(
            false,
            true,
            true
        );

        System.out.println("Resultado del proceso de migración: " + pasaporte.procesar(persona));
    }
}

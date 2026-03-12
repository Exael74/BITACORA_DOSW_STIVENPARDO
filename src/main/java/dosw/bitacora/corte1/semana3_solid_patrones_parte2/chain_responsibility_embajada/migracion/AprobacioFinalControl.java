package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public class AprobacioFinalControl extends ControlMigratorioHandler {

    public boolean procesar(Request ingresoRequest) {
        ingresoRequest.setAprobado(true);
        System.out.println("Ingreso aprobado");
        return ingresoRequest.isAprobado();
    }
}


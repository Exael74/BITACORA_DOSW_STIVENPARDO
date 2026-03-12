package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public class MotivoViajeControl extends ControlMigratorioHandler {

    public boolean procesar(Request ingresoRequest) {
        if (ingresoRequest.isMotivoValido()) return next.procesar(ingresoRequest);
        else{ return ingresoRequest.setAprobado(false);}
    }

}


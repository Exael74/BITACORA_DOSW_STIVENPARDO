package dosw.bitacora.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public interface ControlMigratorio {
    void setNext(ControlMigratorio next);
    boolean procesar(Request ingresoRequest);
}

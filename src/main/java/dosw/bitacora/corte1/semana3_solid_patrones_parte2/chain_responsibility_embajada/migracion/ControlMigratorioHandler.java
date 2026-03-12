package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public abstract class ControlMigratorioHandler implements ControlMigratorio {
    protected ControlMigratorio next;

    @Override
    public void setNext(ControlMigratorio next) {
        this.next = next;
    }

}


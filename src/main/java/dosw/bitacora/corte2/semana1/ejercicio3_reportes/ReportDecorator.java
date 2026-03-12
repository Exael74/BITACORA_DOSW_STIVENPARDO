package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public abstract class ReportDecorator implements Report {
    protected Report wrappee;

    public ReportDecorator(Report wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getContent() {
        return wrappee.getContent();
    }
}

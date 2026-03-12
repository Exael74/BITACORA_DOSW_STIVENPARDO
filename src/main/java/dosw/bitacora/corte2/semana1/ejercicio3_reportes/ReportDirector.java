package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class ReportDirector {
    private ReportBuilder builder;

    public void setBuilder(ReportBuilder builder) {
        this.builder = builder;
    }

    public Report constructReport(String title, String body, String footer) {
        builder.buildHeader(title);
        builder.buildBody(body);
        builder.buildFooter(footer);
        return builder.getReport();
    }
}

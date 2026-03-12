package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class CsvReportBuilder implements ReportBuilder {
    private StringBuilder content;

    public CsvReportBuilder() {
        this.content = new StringBuilder();
    }

    @Override
    public void buildHeader(String title) {
        content.append("title,").append(title).append("\n");
    }

    @Override
    public void buildBody(String bodyContent) {
        content.append("body,").append(bodyContent).append("\n");
    }

    @Override
    public void buildFooter(String footer) {
        content.append("footer,").append(footer).append("\n");
    }

    @Override
    public Report getReport() {
        return () -> content.toString();
    }
}

package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class JsonReportBuilder implements ReportBuilder {
    private StringBuilder content;

    public JsonReportBuilder() {
        this.content = new StringBuilder();
        this.content.append("{\n");
    }

    @Override
    public void buildHeader(String title) {
        content.append("  \"header\": \"").append(title).append("\",\n");
    }

    @Override
    public void buildBody(String bodyContent) {
        content.append("  \"body\": \"").append(bodyContent).append("\",\n");
    }

    @Override
    public void buildFooter(String footer) {
        content.append("  \"footer\": \"").append(footer).append("\"\n");
    }

    @Override
    public Report getReport() {
        return () -> content.toString() + "}";
    }
}

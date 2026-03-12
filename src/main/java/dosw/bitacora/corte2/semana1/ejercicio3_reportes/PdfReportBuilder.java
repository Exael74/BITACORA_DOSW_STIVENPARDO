package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class PdfReportBuilder implements ReportBuilder {
    private StringBuilder content;

    public PdfReportBuilder() {
        this.content = new StringBuilder();
    }

    @Override
    public void buildHeader(String title) {
        content.append("[PDF Title]: ").append(title).append("\n");
    }

    @Override
    public void buildBody(String bodyContent) {
        content.append("[PDF Content]: ").append(bodyContent).append("\n");
    }

    @Override
    public void buildFooter(String footer) {
        content.append("[PDF Footer]: ").append(footer).append("\n");
    }

    @Override
    public Report getReport() {
        return () -> content.toString();
    }
}

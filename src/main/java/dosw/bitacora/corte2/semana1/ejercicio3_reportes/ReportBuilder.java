package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public interface ReportBuilder {
    void buildHeader(String title);
    void buildBody(String content);
    void buildFooter(String footer);
    Report getReport();
}

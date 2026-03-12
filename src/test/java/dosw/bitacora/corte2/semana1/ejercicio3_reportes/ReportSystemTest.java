package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportSystemTest {

    private ReportDirector director;

    @BeforeEach
    public void setup() {
        director = new ReportDirector();
    }

    @Test
    public void testPdfReportWithDigitalSignatureAndWatermark() {
        // 1. Elegimos el Builder
        ReportBuilder pdfBuilder = new PdfReportBuilder();
        director.setBuilder(pdfBuilder);
        
        // 2. Construimos el reporte base
        Report baseReport = director.constructReport("Ventas Q1", "Detalle de ventas...", "Pagina 1");

        // 3. Decoramos con Firma Digital y luego con Marca de Agua
        Report signedReport = new DigitalSignatureDecorator(baseReport);
        Report secureReport = new WatermarkDecorator(signedReport);

        String result = secureReport.getContent();
        
        assertTrue(result.contains("[PDF Title]: Ventas Q1"));
        assertTrue(result.contains("[DigitalSignature]"));
        assertTrue(result.contains("[Watermark]: CONFIDENCIAL"));
    }

    @Test
    public void testCsvReportWithCompression() {
        ReportBuilder csvBuilder = new CsvReportBuilder();
        director.setBuilder(csvBuilder);
        
        Report baseReport = director.constructReport("Empleados", "Juan, Pedro", "Fin CSV");
        Report compressedReport = new CompressionDecorator(baseReport);

        String result = compressedReport.getContent();
        
        assertTrue(result.startsWith("[COMPRESS-START]"));
        assertTrue(result.contains("title,Empleados"));
        assertTrue(result.endsWith("[COMPRESS-END]"));
    }

    @Test
    public void testJsonReportNoDecorators() {
        ReportBuilder jsonBuilder = new JsonReportBuilder();
        director.setBuilder(jsonBuilder);
        
        Report baseReport = director.constructReport("Log", "10 err", "Sys");
        String result = baseReport.getContent();

        assertTrue(result.startsWith("{"));
        assertTrue(result.contains("\"header\": \"Log\""));
        assertTrue(result.endsWith("}"));
        assertFalse(result.contains("[Watermark]"));
    }
}

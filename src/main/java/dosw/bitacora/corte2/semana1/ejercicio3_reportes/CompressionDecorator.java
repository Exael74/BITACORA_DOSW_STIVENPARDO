package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class CompressionDecorator extends ReportDecorator {
    
    public CompressionDecorator(Report wrappee) {
        super(wrappee);
    }

    @Override
    public String getContent() {
        // En un caso real se aplicaría un algoritmo como ZIP. 
        // Aquí indicamos que está comprimido mediante formato de texto.
        return "[COMPRESS-START]\n" + super.getContent() + "\n[COMPRESS-END]";
    }
}

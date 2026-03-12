package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class WatermarkDecorator extends ReportDecorator {
    
    public WatermarkDecorator(Report wrappee) {
        super(wrappee);
    }

    @Override
    public String getContent() {
        return super.getContent() + "\n[Watermark]: CONFIDENCIAL";
    }
}

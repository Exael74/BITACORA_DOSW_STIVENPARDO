package dosw.bitacora.corte2.semana1.ejercicio3_reportes;

public class DigitalSignatureDecorator extends ReportDecorator {
    
    public DigitalSignatureDecorator(Report wrappee) {
        super(wrappee);
    }

    @Override
    public String getContent() {
        return super.getContent() + "\n[DigitalSignature]: Firmado digitalmente por el sistema.";
    }
}

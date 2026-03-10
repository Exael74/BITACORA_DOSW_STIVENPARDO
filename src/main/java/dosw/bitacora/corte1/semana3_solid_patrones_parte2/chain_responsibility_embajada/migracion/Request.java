package dosw.bitacora.corte1.semana2_3.patrones.comportamiento.chainResponsability.migracion;

public class Request {
    private boolean tienePasaporteValido;
    private boolean antecedentesLimpios;
    private boolean motivoValido;
    private boolean aprobado;

    public Request(boolean tienePasaporteValido, boolean antecedentesLimpios, boolean motivoValido) {
        this.tienePasaporteValido = tienePasaporteValido;
        this.antecedentesLimpios = antecedentesLimpios;
        this.motivoValido = motivoValido;
        this.aprobado = false;
    }

    public boolean isTienePasaporteValido() {
        return tienePasaporteValido;
    }
    public boolean isAntecedentesLimpios() {
        return antecedentesLimpios;
    }
    public boolean isMotivoValido() {
        return motivoValido;
    }
    public boolean isAprobado() {
        return aprobado;
    }
    public boolean setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
        return aprobado;
    }
}   


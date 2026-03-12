package dosw.bitacora.corte1.semana2_solid_patrones_parte1.ejercicio3_memento;

import java.util.Stack;

public class ControladorHistorial {
    private Stack<EstadoDocumento> historial = new Stack<>();

    public void guardar(EstadoDocumento estado) {
        historial.push(estado);
    }

    public EstadoDocumento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        System.out.println("No hay estados anteriores que restaurar.");
        return null;
    }
}


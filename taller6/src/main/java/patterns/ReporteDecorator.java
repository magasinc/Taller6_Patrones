package patterns;

public abstract class ReporteDecorator implements Reporte {
    protected Reporte decorado;

    public ReporteDecorator(Reporte decorado) {
        this.decorado = decorado;
    }

    public void generarContenido() {
        decorado.generarContenido();
    }

    public void mostrar() {
        decorado.mostrar();
    }
}

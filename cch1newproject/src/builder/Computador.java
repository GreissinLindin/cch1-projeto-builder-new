package builder;

public class Computador {
    private String tipo;
    private String processador;
    private int ram;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computador " + tipo + " {processador='" + processador + "', ram=" + ram + "GB}";
    }
}

package builder;

public class ComputadorGamerBuilder implements ComputadorBuilder {
    private Computador computador = new Computador();

    public void buildTipo() {
        computador.setTipo("Gamer");
    }

    public void buildProcessador() {
        computador.setProcessador("Intel i9");
    }

    public void buildRAM() {
        computador.setRam(32);
    }

    public Computador getComputador() {
        return computador;
    }
}

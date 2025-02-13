package builder;

public interface ComputadorBuilder {
    void buildTipo();
    void buildProcessador();
    void buildRAM();
    Computador getComputador();
}

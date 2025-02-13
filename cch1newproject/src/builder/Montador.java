package builder;

public class Montador {
    public Computador montarComputador(ComputadorBuilder builder) {
        builder.buildTipo();
        builder.buildProcessador();
        builder.buildRAM();
        return builder.getComputador();
    }
}

package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Montador montador = new Montador();
        ComputadorBuilder gamerBuilder = new ComputadorGamerBuilder();
        Computador computadorGamer = montador.montarComputador(gamerBuilder);
        System.out.println(computadorGamer);
    }
}

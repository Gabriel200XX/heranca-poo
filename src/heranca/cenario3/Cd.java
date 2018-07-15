package heranca.cenario3;

public class Cd extends Produto {
    private double duracao;
    private String gravadora;
    private int numeroFaixas;

    @Override
    public String detalhes() {
        return duracao + "\n" + gravadora + "\n" + numeroFaixas;
    }
}

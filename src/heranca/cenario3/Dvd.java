package heranca.cenario3;

public class Dvd extends Produto {
    private double duracao;
    private String gravadora;

    @Override
    public String detalhes() {
        return duracao + "\n" + gravadora;
    }
}

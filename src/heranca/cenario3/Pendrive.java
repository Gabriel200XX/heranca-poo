package heranca.cenario3;

public class Pendrive extends Produto {
    private double capacidade;
    private String fabricante;

    @Override
    public String detalhes() {
        return capacidade + "\n" + fabricante;
    }
}

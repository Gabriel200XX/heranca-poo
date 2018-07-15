package heranca.cenario3;

public class Livro extends Produto {
    private int paginas;
    private String autor;
    private String editora;

    @Override
    public String detalhes() {
        return paginas + "\n" + autor + "\n" + editora;
    }
}

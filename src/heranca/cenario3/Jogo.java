package heranca.cenario3;

public class Jogo extends Produto {
    private String plataforma;
    private String categoria;
    private boolean multiplayer;

    @Override
    public String detalhes() {
        return plataforma + "\n" + categoria + "\n" + multiplayer;
    }
}

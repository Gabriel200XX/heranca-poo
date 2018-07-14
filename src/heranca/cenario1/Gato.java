package heranca.cenario1;

public class Gato extends Animal {
    private double alturaDoPulo;
    private boolean peloLong;

    public void miar() {
        System.out.println("Miando!");
    }

    public void pular() {
        System.out.println("Pulando!");
    }

    public void beberLeite() {
        System.out.println("Bebendo Leite...");
    }

    public void desaparecer() {
        System.out.println("(Não tem nada aqui)");
    }

    public void cairDePe() {
        System.out.println("Caindo de Pé!");
    }

    public void cacarRato() {
        System.out.println("Caçando Rato!");
    }
}

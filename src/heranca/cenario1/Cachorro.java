package heranca.cenario1;

public class Cachorro extends Animal {
    private double intensidadeDoLativo;

    public void latir() {
        System.out.println("Latindo!");
    }

    public void correrAtrasDoRabo() {
        System.out.println("Correndo atrás do Rabo!");
    }

    public void fingirDeMorto() {
        System.out.println("(RIP)");
    }
}

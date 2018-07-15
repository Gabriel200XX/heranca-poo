package heranca.cenario4;

public class Cone extends Solidos {
    public double raio;
    public double altura;

    @Override
    public void geraVolume() {
        System.out.println((Math.PI * raio * raio * altura) / 3);
    }
}

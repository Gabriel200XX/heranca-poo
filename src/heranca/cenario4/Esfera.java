package heranca.cenario4;

public class Esfera extends Solidos {
    public double raio;

    @Override
    public void geraVolume() {
        System.out.println((4 * Math.PI * raio * raio * raio) / 3);
    }
}

package heranca.cenario4;

public class Cilindro extends Solidos {
    public double areaBase;
    public double raio;
    public double altura;

    @Override
    public void geraVolume() {
        System.out.println(Math.PI * raio * raio * altura);
    }
}

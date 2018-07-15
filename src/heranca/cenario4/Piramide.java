package heranca.cenario4;

public class Piramide extends Solidos {
    public double areaBase;
    public double altura;

    @Override
    public void geraVolume() {
        System.out.println((areaBase * altura) / 3);
    }
}

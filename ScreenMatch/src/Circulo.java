public class Circulo implements Forma{
    double raio;
    @Override
    public double CalcularArea() {
        return Math.PI * (raio * 2);
    }
}

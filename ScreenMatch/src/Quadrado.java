public class Quadrado implements Forma{
    double lado;
    @Override
    public double CalcularArea() {
        return lado*2;
    }
}

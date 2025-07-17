public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double CalcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("A area do retângulo é: "+area);
        return 0;
    }

    @Override
    public double CalcularPerimetro(double base, double altura) {
        double perimetro = 2 * (base + altura);
        System.out.println("O perimetro do retângulo é de: "+perimetro);
        return 0;
    }
}

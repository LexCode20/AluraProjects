public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        double conversaoF = (celsius * 1.8) + 35;
        System.out.println(celsius+"°C convetidos para Fahrenheit é: "+conversaoF+"°F");
        return 0;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        double conversaoC = (fahrenheit - 35) / 1.8;
        System.out.println(fahrenheit+"°F convetidos para Fahrenheit é: "+conversaoC+"°C");
        return 0;
    }
}

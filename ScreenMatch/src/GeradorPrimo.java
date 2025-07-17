import java.util.Random;

public class GeradorPrimo extends NumerosPrimos{
    public void gerarProximoPrimo(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Aleatory number: "+randomNumber);
    }
}

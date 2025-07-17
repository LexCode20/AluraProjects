import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int tentativa = 0, guess = 0;
        System.out.println("hello");
        String name, texto = """
        Welcome to the GUESSING GAME!
        Please, Insert your nick name:
        """;

        System.out.println(texto);
        name = sc.nextLine();
        System.out.println(name+" Good game for you :)\nNext step, you have 5 chances to hit one number between 0 and 100\nLet's gooo!");

        while (tentativa < 5){
            tentativa ++;
            System.out.println(tentativa+"° "+randomNumber);// To know the number.
            //System.out.println(tentativa+"°");// To don't know the number.
            guess = sc.nextInt();
            if(randomNumber > guess){
                System.out.println("The "+guess+" is less than the number generated");
            }else if (randomNumber < guess){
                System.out.println("The "+guess+" is greater than the number generated");
            }else if (randomNumber == guess) {
                System.out.println("Congratulations " + name + " You can guess the number!!!");
                break;
            }
        }
        if (tentativa == 5 && guess != randomNumber){
            System.out.println("GAME OVER\nSo saddd, more luck in the next time :)\nThe number was: "+randomNumber);
        }
    }
}

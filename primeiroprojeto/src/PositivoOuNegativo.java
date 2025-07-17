import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n > 0){
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("\n" + "the number is neither positive nor negative, it is zero");
        }
    }
}

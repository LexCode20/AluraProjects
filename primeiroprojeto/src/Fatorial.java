import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long f = 1;

        System.out.println("Enter a number to calculate its factorial:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("Fatorial de " + n + " é " + f);
    }
}

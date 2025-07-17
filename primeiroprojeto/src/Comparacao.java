import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter a number");
        n1 = sc.nextInt();
        System.out.println("Enter a other number");
        n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("That numbers is same");
        }else if (n1 > n2) {
            System.out.println(n1+" Is greater than "+n2);
        }else {
            System.out.println(n1+" Is less than "+n2);
        }
    }
}

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered a number: ");
        int n = sc.nextInt();

        System.out.println("Tabuada do número 8 "+n);
        for (int i = 0; i <= 10; i++){
            System.out.println(i +"x"+ n+" = "+ i * n);
        }
    }
}

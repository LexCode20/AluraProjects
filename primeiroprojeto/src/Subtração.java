import java.util.Scanner;

public class Subtração {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2, result = 0;
        System.out.print("Digite um número:");
        n1 = sc.nextInt();
        System.out.print("Digite outro número:");
        n2 = sc.nextInt();
        result = n1 - n2;
        System.out.print("O resultado da subtração é: "+result);
    }
}

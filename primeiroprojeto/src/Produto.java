import java.util.Scanner;

public class Produto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double precoProduto, total;
        int quantidade;

        System.out.print("Wrote a price of SmartPhone");
        precoProduto = sc.nextDouble();
        System.out.println("Wrote how much products do you want");
        quantidade = sc.nextInt();
        total = precoProduto * quantidade;
        System.out.println("The price of "+quantidade+ " SmartPhones is R$:"+total);
    }
}

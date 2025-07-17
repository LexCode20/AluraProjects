import java.util.Scanner;

public class Desconto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double precoOriginal, percentualDesconto;
        String produto;
        System.out.println("Qual é o seu produto?");
        produto = sc.nextLine();
        System.out.println("Digite o valor do produto em reais: ");
        precoOriginal = sc.nextInt();
        percentualDesconto = precoOriginal * 0.90;
        System.out.println(produto+" com 10% de desconto: "+percentualDesconto);
    }
}

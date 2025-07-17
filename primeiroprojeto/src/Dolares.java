import java.util.Scanner;

public class Dolares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valorEmDolares, reais;
        String texto = """ 
                Digite a quantidade de doláres que deseja
                para que seja realizada a conversão
                """;
        System.out.println(texto);
        valorEmDolares = sc.nextDouble();
        reais = valorEmDolares * 5.50;
        System.out.println("Valor em reais é: R$:"+reais);
    }
}

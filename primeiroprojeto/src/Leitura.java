import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = sc.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = sc.nextInt();
        System.out.println("Diga a sua avaliação para o filme ");
        double avaliacao = sc.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}

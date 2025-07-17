import java.util.Scanner;

public class Perfil {
    public static void main(String[] args){
        String nome = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ola, qual é o seu nome?");
        nome = sc.nextLine();
        System.out.print("Tudo bem " + nome + "?");
    }
}

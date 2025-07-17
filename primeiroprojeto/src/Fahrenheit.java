import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Bem vindo\nEste programa é um conversor de graus Celcius para Fahrenheit.");
        System.out.println("Agora digite a quantidade de graus celcius que você deseja para a conversão:");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        //Making a Casting
        int temperaturaEmFahrenheiInteira = (int) fahrenheit;
        System.out.println("Esta é a conversão final: "+ temperaturaEmFahrenheiInteira+" Fahrenheit");
    }
}

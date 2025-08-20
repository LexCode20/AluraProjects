package atividade;

import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        int n1, n2, divisao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        n2 = sc.nextInt();
        try {
            divisao = n1 / n2;
            System.out.println(divisao);
        }catch (ArithmeticException e){
            System.out.println("ERRO: Divisão com 0 não é possivel");
        }finally {
            System.out.println("O programa foi finalizado.");
        }
    }
}

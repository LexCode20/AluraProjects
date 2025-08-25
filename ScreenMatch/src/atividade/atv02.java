package atividade;

import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha");
        senha = sc.nextLine();

        try {
            System.out.println("Senha cadastrada com sucesso");
        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa finalizado!");
        }
        if (senha.length()<8){
            throw new SenhaInvalidaException("A senha precisa ter mais de 8 caracteres");
        }
    }
}

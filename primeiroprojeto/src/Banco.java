import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1500, saque = 0;
        int opcao = 0;
        String tipoCOnta = "Corrente", name = "Alexandre Vinicius", mensagem = """
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair""";
        System.out.println("***************************\n");
        System.out.println("Nome: "+name+"\nTipo Conta: "+tipoCOnta+"\nSaldo Inicial R$:"+saldo+"\n");
        System.out.println("***************************\n");

        while (opcao != 4){
            System.out.println(mensagem);
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Saldo atual R$: "+saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o saldo que deseja receber R$: ");
                saldo += saldo = sc.nextDouble();
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja sacar R$: ");
                saque = sc.nextDouble();
                if (saldo < saque){
                    System.out.println("O valor de transferência é maior que o saldo atual");
                }else {
                    saldo -= saque;
                    System.out.println("Novo saldo R$: "+saldo);
                }
            }else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                System.out.println("Opção inválida");
            }
        }
        System.out.println("Muito obrigado pela atenção <:");
    }
}

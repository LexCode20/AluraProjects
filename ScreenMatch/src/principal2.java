import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class principal2 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaFormas= new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for(Forma forma : listaFormas){
            System.out.println(forma.CalcularArea());
        }

        ContaBancaria3 conta = new ContaBancaria3();
        ContaBancaria3 conta2 = new ContaBancaria3();
        ContaBancaria3 conta3 = new ContaBancaria3();
        conta.CriarConta(1,8000);
        conta2.CriarConta(2,8000);
        conta3.CriarConta(3,8000);
        ArrayList<ContaBancaria3> listaContas = new ArrayList<>();
        listaContas.add(conta);
        listaContas.add(conta2);
        listaContas.add(conta3);

        for (ContaBancaria3 contaBancaria3: listaContas) {
            if (conta.getSaldo() > conta2.getSaldo() && conta.getSaldo() > conta3.getSaldo()){
                System.out.println("A conta: "+ conta.getConta()+" Tem o maior saldo R$:"+conta.getSaldo());
                break;
            }else if (conta2.getSaldo() > conta.getSaldo() && conta2.getSaldo() > conta3.getSaldo()){
                System.out.println("A conta: "+ conta2.getConta()+" Tem o maior saldo R$:"+conta2.getSaldo());
                break;
            }else if (conta3.getSaldo() > conta2.getSaldo() && conta3.getSaldo() > conta.getSaldo()){
                System.out.println("A conta: "+ conta3.getConta()+" Tem o maior saldo R$:"+conta3.getSaldo());
                break;
            }else {
                System.out.println("As contas tem valores semelhantes.");
                break;
            }
        }
        Titulo2 titulo2 = new Titulo2("Maça");
        Titulo2 titulo3 = new Titulo2("Abacate");
        Titulo2 titulo4 = new Titulo2("Banana");
        Titulo2 titulo5 = new Titulo2("Uva");
        Titulo2 titulo6 = new Titulo2("Pitaia");
        ArrayList<Titulo2> lista = new ArrayList<>();
        lista.add(titulo2);
        lista.add(titulo3);
        lista.add(titulo4);
        lista.add(titulo5);
        lista.add(titulo6);
        Collections.sort(lista);
        //lista.sort(Comparator.comparing(Titulo2::getNome));
        for (Titulo2 item : lista){
            System.out.println(item.getNome());
        }

        List<String> objetos;
        objetos = new LinkedList<>();
        objetos.add("Televisão");
        objetos.add("Ventilador");
        objetos.add("Mesa");
        objetos.add("Garfo");
        objetos.add("Geladeira");
        objetos.add("Porta");
        Collections.sort(objetos);
        System.out.println(objetos);
    }
}

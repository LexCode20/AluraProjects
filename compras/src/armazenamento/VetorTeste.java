package armazenamento;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Alexandre");
        Aluno a2 = new Aluno("Laís");
        Aluno a3 = new Aluno("Nego");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(1, a1);
        System.out.println(lista.tamanho());
        lista.adiciona(2, a2);
        System.out.println(lista.tamanho());
        System.out.println(lista);

        System.out.println(lista.contem(a3));

        Aluno x = lista.pega(1);
        System.out.println(x);
        lista.pega(299);
        System.out.println(lista);
    }
}

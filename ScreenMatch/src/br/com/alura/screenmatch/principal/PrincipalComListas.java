package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme /*declaração*/ && filme.getClassificacao() > 2)/*casting*/{
                //Filme filme = (Filme) item; declaração
                System.out.println("Classifiação " +filme.getClassificacao());
                //nomes.forEach(nome -> System.out.println(nome));
                //nomes.forEach(System.out::println);
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));//ordenando por ano de lançamento
        System.out.println("Ordenando por ano");
        System.out.println(lista);

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(5);
        numberList.add(9);
        numberList.add(57);
        numberList.add(98);
        numberList.add(7);
        numberList.add(18);

        Collections.sort(numberList);
        System.out.println(numberList);



    }
}

public class Titulo2 implements Comparable<Titulo2>{
    private String nome;

    public Titulo2(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo2 outro) {
        return this.nome.compareTo(outro.getNome());
    }
}

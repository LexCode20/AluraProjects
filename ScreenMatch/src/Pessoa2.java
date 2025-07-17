public class Pessoa2 {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void ApresentarPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Nome: "+this.nome+"\nIdade: "+this.idade+"\n";
    }
}

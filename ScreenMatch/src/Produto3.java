import java.util.ArrayList;

public class Produto3 {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto3(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void caracteriscaProduto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto:\n" +
                "Nome: " + nome + '\n' +
                "Preco: " + preco + '\n' +
                "Quantidade: " + quantidade + '\n';
    }
}

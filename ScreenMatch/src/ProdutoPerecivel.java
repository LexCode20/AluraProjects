public class ProdutoPerecivel extends Produto3{
    private String dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    ///
    @Override
    public String toString() {
        return "Produto:\n" +
                "Nome: " + getNome() + '\n' +
                "Preco R$:" + getPreco() + '\n' +
                "Quantidade: " + getQuantidade() + '\n' +
                "Data de validade: " + this.dataValidade;
    }
}

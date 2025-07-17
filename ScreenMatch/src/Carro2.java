public class Carro2 {
    private double valorVeiculo;
    private String nome;
    private int ano;

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public String nomeModelo(String nome){
        return this.nome;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depreciacao(double valorVeiculo){
        int fip = 10;
        double primeiroAno = valorVeiculo - (valorVeiculo * fip /100);
        double segundoAno = valorVeiculo - (valorVeiculo * 2 * fip /100);
        double terceiroAno = valorVeiculo - (valorVeiculo * 3 * fip /100);
        System.out.println(nome);
        System.out.println("Valor do "+nome+" R$:"+valorVeiculo);
        System.out.println("O valor do "+nome+" após ano R$:"+primeiroAno);
        System.out.println("O valor do "+nome+" após dois anos R$:"+segundoAno);
        System.out.println("O valor do "+nome+" após três anos R$:"+terceiroAno);
    }
}

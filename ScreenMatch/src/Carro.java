public class Carro {
    String modelo = "Celta", cor = "Preto";
    int idade = 2025, fabricacao;

    void fichaTecnica(){
        System.out.println("Modelo: "+modelo+"\nCor: "+cor);
    }
    void calcIdade(int ano){
        idade -= ano;
        System.out.println("Esse carro tem "+idade+" anos de idade");
    }
}

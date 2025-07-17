public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        String som = "Au au au!";
        System.out.println(som);
    }
    public void AbanarRabo(){
        String interacao = "O cachorro está abanando o rabo!";
        System.out.println(interacao);
    }
}

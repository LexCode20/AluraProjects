public class Gato extends Animal{
    @Override
    public void emitirSom() {
        String som = "Miauuuu, miauuuu!";
        System.out.println(som);
    }
    public void arranharMoveis(){
        String interacao = "O gato está arranhando os móveis!";
        System.out.println(interacao);
    }

}

public class Livro {
    private String titulo, autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(String titulo, String autor){
        System.out.println("O título do livro é: "+titulo+"\nO autor do livro é: "+autor);
    }
}

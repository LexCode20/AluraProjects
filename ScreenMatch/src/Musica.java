public class Musica {
    String titulo = "Lalala", artista = "Y2K, bbno$";
    int anoDeLancamento = 2020;
    double avaliacao, numAvaliacoes;
    void exibirFichaTecnica(){
        System.out.println("Titulo: "+titulo+"\nArtistas: "+artista+"\nAno de lançamento: "+anoDeLancamento);
    }
    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }
    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }
}

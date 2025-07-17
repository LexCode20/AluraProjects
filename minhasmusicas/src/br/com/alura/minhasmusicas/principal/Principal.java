package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.MinhasPreferidas;
import br.com.alura.minhasmusicas.Musica;
import br.com.alura.minhasmusicas.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setTitulo("Marcus Mendes");

        for (int j = 0; j < 5000; j++) {
            meuPodcast.reproduz();
        }

        for (int j = 0; j < 1000; j++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}

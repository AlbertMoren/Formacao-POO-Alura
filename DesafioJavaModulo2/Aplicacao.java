import modelos.MinhasPreferidas;
import modelos.Musicas;
import modelos.Poscast;

public class Aplicacao {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        Poscast meuPodecast = new Poscast();
        minhaMusica.setTitulo("musica 1");
        minhaMusica.setArtista("eu");
        for (int i = 0; i < 1000; i++) minhaMusica.curti();
        for (int i = 0; i < 500; i++) minhaMusica.reproduzir();

        meuPodecast.setTitulo("podcast 1");
        meuPodecast.setHost("EU TBEM");
        for (int i = 0; i < 800; i++) meuPodecast.curti();
        for (int i = 0; i < 100; i++) meuPodecast.reproduzir();

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.incluir(meuPodecast);
        minhasPreferidas.incluir(minhaMusica);
        
    }
}

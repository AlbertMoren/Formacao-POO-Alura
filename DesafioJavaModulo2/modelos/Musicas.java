package modelos;

public class Musicas extends Audio{
    private String artista;
    private String album;
    private String genero;


    public String getaArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() >= 200){
            return 10;
        }else{
            return 7;
        }
    }
    
}

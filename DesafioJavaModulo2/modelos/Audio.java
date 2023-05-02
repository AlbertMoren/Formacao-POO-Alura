package modelos;

public class Audio {
    private String titulo;
    private int totalDeReprocuoes;
    private int totalCurtidas;
    private int classificacao;

    public void curti () {
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalDeReprocuoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getTotalDeReprocuoes() {
        return totalDeReprocuoes;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
    
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    
}

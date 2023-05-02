public class Endereco {
    String logadouro;
    String cep;
    String localidade;
    String bairro;
    String Complemento;
    String uf;

    public Endereco(String Logadouro, String cep, String Localizade, String bairro, String Complemento, String uf){
        this.cep = cep;
        this.localidade = localidade;
        this.logadouro = logadouro;
        this.bairro = bairro;
        this.Complemento = Complemento;
        this.uf = uf;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "(Cep = " + getCep() + " Bairro = " + getBairro() + " )";
    }

    
    
}

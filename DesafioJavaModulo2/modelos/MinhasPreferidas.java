package modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto entre todos");
        }else{
            System.out.println(audio.getTitulo() + " é tambem um dos que a galera ta curtindo");
        }
    } 
}

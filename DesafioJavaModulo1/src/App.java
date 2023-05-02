import java.util.Scanner;
public class App {

    public static void conta(String nome, String tipoDeConta, Double valor){
        
        System.out.println("=============================");
        System.out.println("Dados iniciais do Cliente");
        System.out.println("Nome:           "+ nome);
        System.out.println("Tipo de conta:  "+ tipoDeConta);
        System.out.println("Saldo Inicial:  "+ valor);
        System.out.println("=============================");
        System.out.println();
        System.out.println();
    }
    
    public static int menu(String nome, String tipoDeConta, Double valor){
        boolean play = true;
        conta(nome, tipoDeConta, valor);
        while (play) {
            Scanner leitor = new Scanner(System.in);
            System.out.println();
            System.out.println("Operações:");
            System.out.println();
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Trasnferir valor");
            System.out.println("4 - sair");
            int numeroDigitado = leitor.nextInt();
            while (numeroDigitado > 4 ) {
                System.out.println("Insira um valor correto");
                numeroDigitado = leitor.nextInt();
            }
            
            switch (numeroDigitado) {
                case 1:
                    System.out.println("Seu saldo é de R$"+ valor);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o valor recebedido: ");
                    double recebido = leitor.nextDouble();
                    valor += recebido;
                    System.out.println("Saldo atualizado para R$"+ valor);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o valor desejado:");
                    double transferir = leitor.nextDouble();
                    if (valor < transferir) {
                        System.out.println("Nãp ha saldo suficiente para fazer essa transferencia");
                    }else{
                        valor -= transferir;
                        System.out.println("Saldo atualizado para R$"+ valor);
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Obrigado, e volte sempre");
                    System.out.println();
                    play = false;
                    break;
                }
            }
        return 1;
    }


    public static void main(String[] args) throws Exception {
        App.menu("Albert Moren","Conta corrente",1300.0);
    }
    
}

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        //Exibir as mensagens para o nosso usuario
       System.out.println("Bem-vindo! ");
      
        // Criando scanner 
       Scanner scanner = new Scanner(System.in);

        //Perguntando nome do cliente 
       System.out.println("Digite seu nome: ");
       String nomeCliente = scanner.nextLine();


       //Obter pela scanner os valores digitados agencia/conta/saldo
       System.out.println("Digite sua agência: ");
       String agencia = scanner.nextLine();

       System.out.println("Digite sua conta: ");
       int conta = scanner.nextInt();

       System.out.println("Valor de deposito R$:");
       float saldo = scanner.nextFloat();

       
       //imprimindo saida de dados
       System.out.println("Olá," + nomeCliente + ", obrigado por criar uma conta em nosso banco," + 
       " agência: " + agencia + 
       " conta: " + conta + 
       " e seu saldo: R$" + saldo + 
       " ja esta disponivel pra uso.");


    }
}

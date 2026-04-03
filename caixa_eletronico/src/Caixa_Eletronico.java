
import java.util.Scanner;


public class Caixa_Eletronico {

// Delcarando variavel global //

double saldo, novo_valor;
String nome;
int qtd_saque = 3;
int resposta;

/* Comando de execução */

  public void execute() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Olá, seja bem vindo ao BANCO.IA XD");
    System.out.print("Poderia informar o seu nome: ");
    nome = sc.next();
    System.out.println("");

    do  {
    System.out.println("");
    System.out.println("Escolha uma das opções abaixo!");
    System.out.println("");
    System.out.println("==========================================");
    System.out.println("=   1 - Para 'checar o seu saldo'        =");
    System.out.println("=   2 - Para 'depositar um valor'        =");
    System.out.println("=   3 - Para 'sacar o valor'             =");
    System.out.println("= ====================================== =");
    System.out.println("=   0 - Para sair da aplicação           =");
    System.out.println("==========================================");
    System.out.println("");
    System.out.print("Informe a sua escolha: ");
    resposta = sc.nextInt();



    switch (resposta) {
      
        case 1:

            verificar(saldo);
            break;

        case 2:

            System.out.print(nome + " informe o valor que deseja adicionar: R$ ");
            novo_valor = sc.nextDouble();
            depositar(novo_valor);
           
            break;

        case 3:

            System.out.print(nome + " informe o novo valor quedeseja retirar: R$ ");
            novo_valor = sc.nextDouble();
            retirar(novo_valor);

            break;
            default:
              System.out.println("Caro(a) sr(a). " + nome + ", valor invalidado!");
    }

    } while ( resposta != 0);
    
    sc.close();
  }



  // Método de verificar o saldo 
  double verificar (double valor) {

      System.out.println(" ================================= SALDO ATUAL ================================= ");
      System.out.println("");

      System.out.println("Valor Atual : R$" + String.format("%.2f", valor));

      System.out.println("");
      System.out.println(" =============================================================================== ");
       System.out.println("");
      return valor;
    }
  
  // Método de depositar valor
  double depositar (double valor) {
      System.out.println("");
      System.out.println(" ================================= DEPOSITO ================================= ");
      System.out.println("");

      System.out.println("Valor a ser depositado : + R$" + String.format("%.2f", (valor)));
      System.out.println("Valor antes do acrécimo : R$" + String.format("%.2f", (saldo)));
      System.out.println("Valor Após a adição : R$" + String.format("%.2f", (saldo + valor)));

      System.out.println("");
      System.out.println(" ============================================================================ ");
      System.out.println("");

      return (saldo += valor);
    }

  // Método de sacar valor
  double retirar (double saque) {
  
      if ((qtd_saque > 0) && (saque < 1000) && (saque <= saldo)){
        System.out.println("");
        System.out.println(" ================================= RETIRADA ================================= ");
        System.out.println("");

        System.out.println("Valor a ser retirado : R$" + String.format("%.2f", (saque)));
        System.out.println("Novo Valor Atual : R$" + String.format("%.2f", (saldo - saque)));

        System.out.println("");
        saldo -= saque;
        System.out.println("Caro sr(a). "+ nome +", limite de saque atual: " + (--qtd_saque) +" vezes.");
        System.out.println(" ============================================================================ ");
        System.out.println("");
        
      } else if (saque > saldo)  {
        System.out.println("");
        System.out.println("Caro(a) sr(a). " + nome + ", o valor solicitado está acima do limite do seu saldo:");
        System.out.println("O valor atual do seu saldo é R$" + String.format("%.2f", saldo));
        System.out.println("O valor solicidado é R$" + String.format("%.2f", saque));
      }

    return (saldo);
  }

}

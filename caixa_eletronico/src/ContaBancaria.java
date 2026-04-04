import java.util.Scanner;

public class ContaBancaria {

  int numero;
  String titular;
  double saldo;
  int qtd_saque;

/* Método para cição de nova conta */ 
public ContaBancaria(int numero, String titular) {
  this.numero = numero;
  this.titular = titular;
  this.saldo = 50.0;
  this.qtd_saque = 3;
}

 void depositar (double valor) {
      System.out.println("");
      System.out.println(" ================================= DEPOSITO ================================= ");
      System.out.println("");
      System.out.println("Valor a ser depositado : + R$" + String.format("%.2f", (valor)));
      System.out.println("Valor antes do acrécimo : R$" + String.format("%.2f", (saldo)));
      System.out.println("Valor Após a adição : R$" + String.format("%.2f", (saldo + valor)));
      System.out.println("");
      System.out.println(" ============================================================================ ");
      System.out.println("");

      //Altera o valor do saldo
      saldo += valor;
  }

  void verificar () {
      System.out.println(" ================================= SALDO ATUAL ================================= ");
      System.out.println("");
      System.out.println("Valor Atual : R$" + String.format("%.2f", saldo));
      System.out.println("");
      System.out.println(" =============================================================================== ");
      System.out.println("");
  }

  void sacar(double valor, Scanner sc) {
    int retorno = 1;
    double saque = valor;
    while(retorno == 1) {
        if ((qtd_saque > 0) && (saque <= 1000) && (saque <= this.saldo)) {
            System.out.println("");
            System.out.println(" ================================= RETIRADA ================================= ");
            System.out.println("");
            
            // Retira o valor do saldo
            this.saldo -= saque;

            System.out.println("Valor retirado : R$" + String.format("%.2f", (saque)));
            System.out.println("Valor Atual na conta : R$" + String.format("%.2f", (this.saldo)));
            System.out.println("");  
            System.out.println("Caro sr(a). " + this.titular + ", limite de saque atual: " + (qtd_saque - 1) +" vezes.");
            System.out.println(" ============================================================================ ");
            System.out.println("");

        } else {

            if (saque > 1000) {
                System.out.println("");
                System.out.println("O valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
                System.out.println("");
            }

            if (qtd_saque <= 0) {
                System.out.println("");
                System.out.println("Caro(a) sr(a). " + this.titular + ", você atingiou o limite máximo de saque por dia!");
                System.out.println("Tente novamente outro dia!");
                System.out.println("");
            }

            if (saque > saldo) {
                System.out.println("");
                System.out.println("Caro(a) sr(a). " + this.titular + ", o valor solicitado está acima do limite do seu saldo:");
                System.out.println("O valor atual do seu saldo é R$" + String.format("%.2f", this.saldo));
                System.out.println("O valor solicidado é R$" + String.format("%.2f", saque));
                System.out.println("Saque não realizado");
                System.out.println("");
            }
        }

        System.err.println("");
        System.err.println("Deseja tentar realizar uma nova transição ?");
        System.err.print("Digite 1 para Sim ou 2 para Não: ");
        retorno = sc.nextInt();
        
        if (retorno == 1) {
            System.err.println("");
            System.err.print("Informe o novo valor que deseja retirar: R$");
            saque = sc.nextDouble();
            qtd_saque--;
        }
    }
  }
}

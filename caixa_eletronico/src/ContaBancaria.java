public class ContaBancaria {

  int numero;
  String titular;
  double saldo;
  int qtd_saque;

/* Método para cição de nova conta*/ 
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

  void sacar(double valor) {

    if ((qtd_saque > 0) && (valor <= 1000) && (valor <= saldo)) {
        System.out.println("");
        System.out.println(" ================================= RETIRADA ================================= ");
        System.out.println("");
        // Retira o valor do saldo
        saldo -= valor;

        System.out.println("Valor a ser retirado : R$" + String.format("%.2f", (valor)));
        System.out.println("Novo Valor Atual : R$" + String.format("%.2f", (saldo)));

        System.out.println("");
        
      
      

        System.out.println("Caro sr(a). " + titular + ", limite de saque atual: " + (--qtd_saque) +" vezes.");
        System.out.println(" ============================================================================ ");
        System.out.println("");

    } else {

        if (valor > 1000) {
            System.out.println("");
            System.out.println("O valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
            System.out.println("");
        }

        if (qtd_saque <= 0) {
            System.out.println("");
            System.out.println("Caro(a) sr(a). " + titular + ", você atingiou o limite máximo de saque por dia!");
            System.out.println("Tente novamente outro dia!");
            System.out.println("");
        }

        if (valor > saldo) {
            System.out.println("");
            System.out.println("Caro(a) sr(a). " + titular + ", o valor solicitado está acima do limite do seu saldo:");
            System.out.println("O valor atual do seu saldo é R$" + String.format("%.2f", saldo));
            System.out.println("O valor solicidado é R$" + String.format("%.2f", valor));
            System.out.println("");
        }
    }
  }

// Método para criação de usuários novos

}

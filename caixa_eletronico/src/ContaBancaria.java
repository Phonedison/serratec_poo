
import interfaces.Contas;
import java.util.Scanner;

public class ContaBancaria implements Contas {

  public String titular;
  public int numero;
  int qtd_saque;
  double saldo;


  /* Método para cição de nova conta */ 
  public ContaBancaria(int numero, String titular) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = 50.0;
    this.qtd_saque = 3;
  }

  /* Declarando os métodos com base na interface 'interfaces/Contas' e alterando os seus valores. */
  @Override
  public void depositar(double valor) {

    tituloTexto("DEPOSITO");
    System.out.println("Valor a ser depositado : + R$" + String.format("%.2f", (valor)));
    System.out.println("Valor antes do acrécimo : R$" + String.format("%.2f", (saldo)));
    System.out.println("Valor Após a adição : R$" + String.format("%.2f", (saldo + valor)));
    separadorTexto();

    //Altera o valor do saldo
    saldo += valor;

  }

  @Override 
  public void sacar(double valor, Scanner sc) {

  int retorno = 1;
    double saque = valor;

      while(retorno == 1) {
        if ((qtd_saque > 0) && (saque <= 1000) && (saque <= this.saldo)) {
         
          tituloTexto("RETIRADA");
          
          // Retira o valor do saldo
          this.saldo -= saque;

          System.out.println("Valor retirado : R$" + String.format("%.2f", (saque)));
          System.out.println("Valor Atual na conta : R$" + String.format("%.2f", (this.saldo)));
          System.out.println("");  
          System.out.println("Caro sr(a). " + this.titular + ", limite de saque atualizado!");
          System.err.println("Você pode realizar mais " + (qtd_saque - 1) +" transições.");
          separadorTexto();

        } else {

          if (saque > 1000) {
              separadorTexto();
              System.out.println("O valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
              separadorTexto();
          }

          if (qtd_saque <= 0) {
              separadorTexto();
              System.out.println("Caro(a) sr(a). " + this.titular + ", você atingiou o limite máximo de saque por dia!");
              System.out.println("Tente novamente outro dia!");
              separadorTexto();
          }

          if (saque > saldo) {
              separadorTexto();

              System.out.println("Caro(a) sr(a). " + this.titular + ", o valor solicitado está acima do limite do seu saldo:");
              System.out.println("O valor atual do seu saldo é R$" + String.format("%.2f", this.saldo));
              System.out.println("O valor solicidado é R$" + String.format("%.2f", saque));
              System.out.println("Saque não realizado");
              
              separadorTexto();
          }
        }
        System.err.println();
        Confirmacao menu = new Confirmacao();
        retorno = menu.menuConfirmacao(sc,"Você deseja Continuar ?" );
        
        separadorTexto();

        if (retorno == 1) {
          System.out.print("Informe o novo valor que deseja retirar: R$");
          saque = sc.nextDouble();
          qtd_saque--;
          separadorTexto();

        }
    }
  }

  @Override
  public void verificar() {

      tituloTexto("SALDO ATUAL");
      System.out.println("Valor Atual : R$" + String.format("%.2f", saldo));
      separadorTexto();

  }


  /* métodos privados para impressão dos valores */
  private void separadorTexto () {

    System.out.println("");
    System.out.println(" ============================================================================ ");
    System.out.println("");

  }

  private void tituloTexto (String titulo) {

    System.out.println("");
    System.out.println(" ================================= " + titulo + " ================================= ");
    System.out.println("");

  }
}

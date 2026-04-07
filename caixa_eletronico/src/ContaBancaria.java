import interfaces.Contas;
import java.util.Scanner;

public class ContaBancaria implements Contas {

  Separador conteudo = new Separador();

  private String titular;
  private int numero;
  private int qtd_saque = 50;
  private double saldo;

  /* GET */ 

  public String getTitular() {
    return this.titular;
  }

  public int getNumero() {
    return this.numero;
  }

  public int getQtd_saque() {
    return this.qtd_saque;
  }

  public double getSaldo() {
    return this.saldo;
  }

  /* SET */ 
  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  void setQtd_saque() {
    this.qtd_saque--;
  }

  void setSaldo(double saldo) {
    this.saldo = saldo;
  }

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
    
    conteudo.tituloTexto("DEPOSITO");

    System.out.println("Valor a ser depositado : + R$" + String.format("%.2f", (valor)));
    System.out.println("Valor antes do acrécimo : R$" + String.format("%.2f", (getSaldo())));
    System.out.println("Valor Após a adição : R$" + String.format("%.2f", (getSaldo() + valor)));
   
    conteudo.separadorTexto();
    //Altera o valor do saldo
    setSaldo(getSaldo() + valor);

  }

  @Override 
  public void sacar(double valor, Scanner sc) {

  int retorno = 1;
    double saque = valor;

      while(retorno == 1) {
       
        if ((getQtd_saque() > 0) && (saque <= 1000) && (saque <= getSaldo())) {
         
          conteudo.tituloTexto("RETIRADA");
          
          // Retira o valor do saldo
         setSaldo(getSaldo() - saque);

          System.out.println("Valor retirado : R$" + String.format("%.2f", (saque)));
          System.out.println("Valor Atual na conta : R$" + String.format("%.2f", (getSaldo())));
          System.out.println("");  
          System.out.println("Caro sr(a). " + getTitular() + ", limite de saque atualizado!");
          System.err.println("Você pode realizar mais " + (getQtd_saque() - 1) +" transições.");
          conteudo.separadorTexto();

        } else {

          if (saque > 1000) {
              conteudo.separadorTexto();
              System.out.println("O valor máximo por saque é de R$ 1.000,00, por questões de segurança.");
              conteudo.separadorTexto();
          }

          if (getQtd_saque() <= 0) {
              conteudo.separadorTexto();
              System.out.println("Caro(a) sr(a). " + getTitular() + ", você atingiou o limite máximo de saque por dia!");
              System.out.println("Tente novamente outro dia!");
              conteudo.separadorTexto();
          }

          if (saque > getSaldo()) {
              conteudo.separadorTexto();

              System.out.println("Caro(a) sr(a). " + getTitular() + ", o valor solicitado está acima do limite do seu saldo:");
              System.out.println("O valor atual do seu saldo é R$" + String.format("%.2f", getSaldo()));
              System.out.println("O valor solicidado é R$" + String.format("%.2f", saque));
              System.out.println("Saque não realizado");
              
              conteudo.separadorTexto();
          }
        }
        System.err.println();
        Confirmacao menu = new Confirmacao();
        retorno = menu.menuConfirmacao(sc,"Você deseja Continuar ?" );
        
        conteudo.separadorTexto();
        conteudo.limparConsole();

        if (retorno == 1) {
          System.out.print("Informe o novo valor que deseja retirar: R$");
          saque = sc.nextDouble();
          setQtd_saque();
          conteudo.separadorTexto();

        }
    }
  }

  @Override
  public void verificar() {
      conteudo.limparConsole();
      conteudo.tituloTexto("SALDO ATUAL");
      System.out.println("Valor Atual : R$" + String.format("%.2f", getSaldo()));
      conteudo.separadorTexto();

  }
}

/*
Exemplo mostrado em: https://www.youtube.com/watch?v=nODe5lFcGpg&t=5420s, adaptei o conceito para o trabalho

*** obs: A interface no java é um exemplo que a 'classe' precisa seguir como exemplo de criação... Por isso, foi declarado verificar, depositar e sacar.
*/

package interfaces;
import java.util.Scanner;

public interface Contas {
  
  void verificar(); //assinatura do método -> declara mas não impõe ações para ele
  void depositar(double valor);
  void sacar (double valor, Scanner sc);
}

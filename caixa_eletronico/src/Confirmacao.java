
import java.util.Scanner;

public class Confirmacao {

  public int menuConfirmacao(Scanner sc, String mensagem) {
    int info;
    
    System.out.println(mensagem);
    System.out.println("");
    System.out.println("==========================================");
    System.out.println("=       1 - Para 'Confirmar'             =");
    System.out.println("=       2 - Para 'Cancelar'              =");
    System.out.println("==========================================");
    System.out.println("");
    System.out.print("Informe a sua resposta : ");

    info = sc.nextInt();

    System.out.println("");
    System.out.println("==========================================");
    
    return info;
    }
}

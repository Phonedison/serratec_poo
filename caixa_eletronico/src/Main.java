
import java.util.ArrayList; //Clsse que implementa o Array
import java.util.List; // importando comportamento de uma lista ordenada
import java.util.Scanner;

public class Main {
// Delcarando variavel global //
    double saldo, novo_valor;
    int numero_titular;
    int qtd_saque = 3;
   

    public static void main(String[] args) throws Exception {
      
        Main caixa_eletronico = new Main();
        caixa_eletronico.Execute();

    }

/* Comando de execução */
  public void Execute() {
    Scanner sc = new Scanner(System.in);

   
    List<ContaBancaria> usuarios = new ArrayList<>(); //criar um array do tipo ContaBancaria

    //dados para lista, simples para evitar de bugar:

    usuarios.add(new ContaBancaria(0001,"Lucas da Silva"));
    ContaBancaria usuario_encontrado = null; // variavel ContaBancaria 


    System.out.println("Olá, seja bem vindo ao BANCO.IA XD");
    System.out.print("Poderia informar o seu número : ");
    numero_titular = sc.nextInt();  
     
    for(ContaBancaria usuario: usuarios) { //Passa por toda a lista de ARRAY e busca o usuario informado
        
        if(numero_titular == usuario.numero) { //Se encontrar
            usuario_encontrado = usuario; // variavel usuario_encontrado recebe o endereçamento / dados do objeto usuario
            break; //força parar a procura;
        }
    }

    if (usuario_encontrado != null) {
        System.out.println("");
    } else {

    }
    

    sc.close();
  }

  void exibirMenuAplicacao (ContaBancaria usuario) {
    
    Scanner sc = new Scanner(System.in); //Atribuindo método de leitura
    
    int resposta; //criando variavel para utilizar a resposta do usuario

    do  {
    //Detalhes: Criar um menu com do-while e switch (1-Ver Saldo, 2-Depositar, 3-Sacar, 0-Sair).
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
                usuario.verificar();
                break;

            case 2:
                System.out.print(usuario.titular + " informe o valor que deseja adicionar: R$ ");
                novo_valor = sc.nextDouble();
                usuario.depositar(novo_valor);
                break;

            case 3:
                System.out.print(usuario.titular  + " informe o novo valor quedeseja retirar: R$ ");
                novo_valor = sc.nextDouble();
                usuario.sacar(novo_valor);
                break;

            default:
                System.out.println("Caro(a) sr(a). " + usuario.titular + ", valor invalidado!");
        }
        
    } while ( resposta != 0);
  }
}

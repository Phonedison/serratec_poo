import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Caixa {
 Separador conteudo = new Separador(); // Método para uso do conteúdo

  public void Execute() {

    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US); // Força o script a ignorar a configuração local da maquina para inserção de valores, aceitando o padrão AMERICANO 

    System.out.println("Olá, seja bem vindo ao BANCO.IA XD");
    System.out.print("Informe o número da sua conta: ");
    int numeroTitular = sc.nextInt(); // renomeei a variavel para manter o padrão da linguagem de Java

    List<ContaBancaria> usuarios = new ArrayList<>(); //Criar um array do tipo ContaBancaria

   

    ContaBancaria usuarioEncontrado = null; // uma variavel ContaBancaria declarada vazia para receber o valor da pesquisa, caso seja encontrado.
    
    for(ContaBancaria usuario: usuarios) { // Passa por toda a lista 'usuários' utilizando a propriedade 'usuario' como 'index' de pesquisa

        if(numeroTitular == usuario.getNumero()) { // Checa se no index está o valor de 'numeroTitular' é igual a 'usuario.numero'
            usuarioEncontrado = usuario; // variavel usuarioEncontrado armazena os valores do 'objeto usuario escolhido' 
            break; //força a procura parar 
        }
    }
    
    // executa a função de criar conta.
    menuCriarConta(numeroTitular, usuarioEncontrado, usuarios, sc);


    //Método de limpeza do terminal
    conteudo.limparConsole();
    
    // finaliza a execução do método scanner
    sc.close();
       
    }

    private void exibirMenuAplicacao (ContaBancaria usuario, Scanner sc) {
        
         int resposta = 0; //criando a variavel para utilizar a resposta do usuario
        double novo_valor; // variavel para recber um novo valor pelo usuario no switch
        do  {
          
          // variavel resposta  recebe o valor passado pelo usuário na execução da função / método "menuPrincipal"
          resposta = menuPrincipal(resposta, sc);

            switch (resposta) {
                
                case 1 -> {
                    // retorna o valor do saldo do usuario criado
                    usuario.verificar();
                }

                case 2 -> {
                    System.out.print(mensagemTransicao(String.valueOf(usuario.getTitular()),"adicionar"));
                    novo_valor = sc.nextDouble();
                   
                    usuario.depositar(novo_valor);  // passa o valor de deposito informado pelo usuario utilizando o método depositar() do objeto e retorna o valor do saldo do usuario + o valor do deposito. 
                    break;
                }

                case 3 -> {
                    System.out.print(mensagemTransicao(String.valueOf(usuario.getTitular()),"retirar"));
                    novo_valor = sc.nextDouble();

                    usuario.sacar(novo_valor, sc); // passa o valor de saque informado pelo usuario utilizando o método sacar() do objeto e retorna o valor do saldo do usuario - o valor do saque informado. 
                    break;
                }
                    
                case 0 -> { // caso o usuário responda '0', o valor passa pelo escolha / caso para monstrar uma mensagem de finalização
                    System.out.println("Caro(a) " + usuario.getTitular() + " obrigado por utilizar BANCO.IA");
                    System.out.println("Finalizando serviço!");
                 
                    break;
                }

                default -> {  // caso o usuário responda 'algo diferente dos valores informados', o escolha / caso retorna com o menu!
                    System.out.println("Caro(a) sr(a). " + usuario.getTitular() + ", valor invalidado!");
                }
            }

        } while ( resposta != 0);
       
    }

    //método privado para criação de conta
    private void criarConta (int numeroTitular, List<ContaBancaria> lista_usuario, Scanner sc) {
        sc.nextLine(); // limpa

        conteudo.limparConsole();

        System.out.println("Conforme informado anteriormente, o numero da conta será: " + numeroTitular);
      
        System.out.print("Digite o seu nome: ");
        String nome_conta = sc.nextLine(); //Erro mais ou menos aqui
        
        

        ContaBancaria nova_conta = new ContaBancaria(numeroTitular, nome_conta);
        lista_usuario.add(nova_conta);
        System.out.println("");



        System.out.println("Conta de " + numeroTitular + " - " + nome_conta + " criada!");
        exibirMenuAplicacao(nova_conta, sc);

        //Método de limpeza do terminal
       
    
    }

    //método privado para apresentar o menu de criação de conta
   private void menuCriarConta(int numeroTitular, ContaBancaria usuarioEncontrado, List<ContaBancaria> usuarios, Scanner sc) {
        
    if (usuarioEncontrado == null) { // se não for encontrado, abre a tela de criação de usuário

            System.out.println("");
            System.out.println("Titular não encontrado!");
            System.out.println("");

            Confirmacao menu = new Confirmacao();
            int info = menu.menuConfirmacao(sc, "Deseja se cadastrar ?");

        switch(info) {

            case 1 -> {
                //Método de limpeza do terminal
                conteudo.limparConsole();

                criarConta(numeroTitular, usuarios, sc); //Chama o método de criação do usuário
            } 

            case 2 -> {
                //Método de limpeza do terminal
                conteudo.limparConsole();

                System.out.println("Ok, projeto Conta Bancárias finalizado!");
                break; // Vendo a possibilidade de novos métodos
            } 
        } 
      
        
    } else {
            // System.out.println("");

            //Método de limpeza do terminal
            conteudo.limparConsole();

            System.out.println("Seja bem vindo " + usuarioEncontrado.getTitular() + "!");
            exibirMenuAplicacao(usuarioEncontrado, sc); //exibe a tela de login para o usuario.
        } 



    }

    private String mensagemTransicao (String nome, String acao) {
        return ("Caro(a) " + nome + " informe o valor que deseja " + acao + ": R$");
    }

    private int menuPrincipal(int resposta, Scanner sc){
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

        System.out.println("");
        System.out.println("==========================================");

        return resposta;
    }
  

  

}
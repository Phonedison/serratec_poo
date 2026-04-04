import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caixa {

  void Execute() {

    int numero_titular;
    Scanner sc = new Scanner(System.in);


    List<ContaBancaria> usuarios = new ArrayList<>(); //Criar um array do tipo ContaBancaria

    //dados para lista, simples para evitar de bugar:
    usuarios.add(new ContaBancaria(0001,"Lucas da Silva"));
    
    ContaBancaria usuario_encontrado = null; // variavel ContaBancaria 

    System.out.println("Olá, seja bem vindo ao BANCO.IA XD");
    System.out.print("Poderia informar o seu número : ");
    numero_titular = sc.nextInt();  

        for(ContaBancaria usuario: usuarios) { // Passa por toda a lista 'usuários' utilizando o 'usuario' como 'index'

            if(numero_titular == usuario.numero) { // Checa se no index está o valor de 'numero_titular' é igual a 'usuario.numero'
                usuario_encontrado = usuario; // variavel usuario_encontrado armazena os valores do 'objeto usuario escolhido' 
                break; //força a procura parar 
            }
        }
        
       menuCriacaoUsuario(usuario_encontrado,usuarios, sc);

    sc.close();
    }

    void exibirMenuAplicacao (ContaBancaria usuario, Scanner sc) {
        int resposta = 0; //criando a variavel para utilizar a resposta do usuario
         double novo_valor;
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
            case 1 -> {
                usuario.verificar();
            }

            case 2 -> {
                System.out.print(mensagemTransicao(String.valueOf(usuario.titular),"adicionar"));
                novo_valor = sc.nextDouble();
                usuario.depositar(novo_valor);
                break;
            }

            case 3 -> {
                System.out.print(mensagemTransicao(String.valueOf(usuario.titular),"retirar"));
                novo_valor = sc.nextDouble();
                usuario.sacar(novo_valor, sc);
                break;
            }
                
            case 0 -> {
                System.out.print("Caro(a) " + usuario.titular + " obrigado por utilizar BANCO.IA");
                System.out.print("Finalizando serviço!");
                break;
            }

            default -> {
                System.out.println("Caro(a) sr(a). " + usuario.titular + ", valor invalidado!");
            }
        }

        } while ( resposta != 0);
    }

    void criarConta (List<ContaBancaria> lista_usuario, Scanner sc) {

        System.out.print("Digite o id da conta: ");
        int numero_conta = sc.nextInt();
    
        System.out.print("Digite o seu nome: ");
        String nome_conta = sc.next();
    
        ContaBancaria nova_conta = new ContaBancaria(numero_conta,nome_conta);
        lista_usuario.add(nova_conta);

        System.out.println("Conta de " + nome_conta + " criada!");
        exibirMenuAplicacao(nova_conta, sc);
    
    }

    void menuCriacaoUsuario(ContaBancaria usuario_encontrado, List<ContaBancaria> usuarios, Scanner sc) {
        
      if (usuario_encontrado == null) { // se não for encontrado, abre a tela de criação de usuário

            System.out.println("");
            System.out.println("Titular não encontrado!");
            System.out.println("Deseja se cadastrar ?");
            System.out.println("");
            System.out.println("==========================================");
            System.out.println("=       1 - Para 'Confirmar'             =");
            System.out.println("=       2 - Para 'Cancelar'              =");
            System.out.println("==========================================");
            System.out.println("");
            System.out.print("Informe a sua resposta : ");
            int info = sc.nextInt();
            System.out.println("");

        switch(info) {

            case 1 -> {
                criarConta(usuarios, sc); //Chama o método de criação do usuário
            } 

            case 2 -> {} // Vendo a possibilidade de novos métodos
        }  //Só sai do projeto
      
        
        } else {
            System.out.println("");
            System.out.println("Seja bem vindo " + usuario_encontrado.titular + "!");
            exibirMenuAplicacao(usuario_encontrado, sc); //exibe a tela de login para o usuario.
        } 
    }

    String mensagemTransicao (String nome, String acao) {
        return ("Caro(a) " + nome + " informe o valor que deseja " + acao + ": R$");
    }
}

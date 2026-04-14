
import entidades.Pedido;
import entidades.Produto;
import java.time.LocalDate;
import user.Cliente;
import user.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        Produto geladeira = new Produto("Geladeira", 1500.00);
        Produto fogao = new Produto("Fogão", 800.00);
        Produto microondas = new Produto("Microondas", 400.00);
        Produto fone = new Produto("Fone de ouvido", 15.00);

        Endereco endereco = new Endereco("Rua Fernando", "Glória", "Petrópolis");

        Cliente cliente = new Cliente("Lucas", endereco);

        Pedido pedido = new Pedido(1, LocalDate.now(), cliente);

        pedido.adicionarProduto(2, fone);
        pedido.adicionarProduto(1, geladeira);
        pedido.adicionarProduto(1, fogao);

        cliente.adicionarPedido(pedido);

        System.out.println(cliente);
        pedido.fecharPedido();
    }
}

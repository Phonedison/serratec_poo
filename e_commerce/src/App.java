import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import user.Cliente;
import user.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        // Pedido produto_1 = new Pedido(1, LocalDate.now());
        // Pedido produto_2 = new Pedido(2, LocalDate.now());
        // Pedido produto_3 = new Pedido(3, LocalDate.now());

        Produto geladeira = new Produto("geladeira", 5000.00);
        Produto fogao = new Produto("fogao", 2500.00);
        Produto foneOuvido = new Produto("Fone de ouvido", 15.00);

        ItemPedido pedido_1 = new ItemPedido(2, foneOuvido);
        ItemPedido pedido_2 = new ItemPedido(1, geladeira);
        ItemPedido pedido_3 = new ItemPedido(1, fogao);

        Endereco endereco_1 = new Endereco("Rua fernando", "Bairro da Glória", "Petropolis");
        Endereco endereco_2 = new Endereco("Paqueta", "Bairro Seilá", "Meu deus");

        List<ItemPedido> item_cliente_1 = new ArrayList<>();
        item_cliente_1.add(pedido_1);
        item_cliente_1.add(pedido_2);

        List<ItemPedido> item_cliente_2 = new ArrayList<>();
        item_cliente_2.add(pedido_1);
        item_cliente_2.add(pedido_3);

        Cliente cliente_1 = new Cliente("Lucas", endereco_1, item_cliente_1);
        Cliente cliente_2 = new Cliente("Lamas", endereco_2, item_cliente_2);

        System.out.println(cliente_1.toString());
        String teste = (cliente_1.toString());
        System.out.println("");
        System.out.println(cliente_2.toString());
        System.out.println("");

        Pedido pedido = new Pedido(1, LocalDate.now(), cliente_1);
        pedido.adicionarProduto(foneOuvido, 2);
        pedido.adicionarProduto(geladeira, 1);
        pedido.fecharPedido();
    }
}

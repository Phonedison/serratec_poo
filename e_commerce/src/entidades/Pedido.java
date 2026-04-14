package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import user.Cliente;

public class Pedido {

  private Integer numeroPedido;
  private LocalDate dataPedido;
  private List<ItemPedido> listaItens;
  private Cliente cliente;

  public Pedido(Integer numeroPedido, LocalDate dataPedido, Cliente cliente) {
    this.numeroPedido = numeroPedido;
    this.dataPedido = dataPedido;
    this.listaItens = new ArrayList<>();
    this.cliente = cliente;
  }

  public void adicionarProduto(Integer qtd, Produto produto) {
    listaItens.add(new ItemPedido(qtd, produto));
  }

  public double calcularValorTotal() {
    double total = 0.0;
    for (ItemPedido item : listaItens) {
      total += item.calcularSubtotal();
    }
    return total;
  }

  public void fecharPedido() {
    double frete = (calcularValorTotal() >= 250.0) ? 0.0 : 25.0;
    double totalFinal = calcularValorTotal() + frete;
    int totalItens = 0;

    StringBuilder sb = new StringBuilder();
    sb.append(" ==== RECIBO DE COMPRA ====\n")
        .append("Pedido: ").append(this.numeroPedido).append("\n")
        .append("Data: ").append(this.dataPedido).append("\n")
        .append(cliente.getNome()).append("\n\n").append(" --- ITENS --- \n\n");

    for (ItemPedido item : listaItens) {
      sb.append(item.toString());
      totalItens += item.getQtdSolicitada();
    }

    sb.append("\nTotal de Itens: ").append(totalItens)
        .append(String.format("\nTotal: R$%.2f", calcularValorTotal()))
        .append("\nFrete: R$ ").append(String.format("%.2f", frete))
        .append("\nTotal Final: R$ ").append(String.format("%.2f", totalFinal)).append("\n");

    System.out.println(sb.toString());
  }
}

package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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

  public Integer getNumeroPedido() {
    return numeroPedido;
  }

  public void setNumeroPedido(Integer numeroPedido) {
    this.numeroPedido = numeroPedido;
  }

  public LocalDate getDataPedido() {
    return dataPedido;
  }

  public void setDataPedido(LocalDate dataPedido) {
    this.dataPedido = dataPedido;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public List<ItemPedido> getListaItens() {
    return Collections.unmodifiableList(this.listaItens);
  }

  public void setListaItens(List<ItemPedido> listaItens) {
    this.listaItens = listaItens;
  }

  public void adicionarProduto(Produto produto, Integer qtd) {

    ItemPedido item = new ItemPedido(qtd, produto);
    this.listaItens.add(item);
    this.total += item.getSubtotal();

  }

  public void calcularTotalItens() {
    double total = 0.0;
    for (ItemPedido item : this.listaItens) {
      total += item.calcularSubtotal();
    }
    this.total = total;
  }

  public void fecharPedido() {
    calcularTotalItens();
    Double frete = (this.total < 250.0) ? 0.0 : 25.0;
    this.entrega_total = this.total + frete;

    System.out.println("===== RECIBO =====");
    System.out.println("Numero do Pedido: " + numeroPedido);
    System.out.println("Data do Pedido: " + LocalDate.now());
    System.out.println("Cliente: " + cliente.getNome());

    System.out.println("===== ITENS DO PEDIDO =====");
    for (ItemPedido item : listaItens) {
      System.out.println(" ");
      System.out.println("Nome Do Produto: " + item.getProduto().getNome());
      System.out.println("Preço Da Unidade: " + item.getProduto().getValor());
      System.out.println(" ");
    }

    System.out.println("=========================");
    System.out.println("Total dos Itens: " + this.listaItens.size());
    System.out.println("Frete : " + frete);
    System.out.println("Total Da Compra: " + this.entrega_total);
    System.out.println("=========================");
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Pedido nº: ")
        .append(this.numeroPedido)
        .append(" | Data: ")
        .append(this.dataPedido)
        .append("\n==========================\n");

    for (Object item : listaItens) {
      sb.append(item.toString()).append("\n");
    }

    sb.append("==========================\n")
        .append("TOTAL DO PEDIDO R$: ")
        .append(String.format("%.2f\n", this.entrega_total));

    return sb.toString();
  }

}

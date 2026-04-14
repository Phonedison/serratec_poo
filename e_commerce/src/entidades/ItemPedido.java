package entidades;

public class ItemPedido {

  private Integer qtdSolicitada;
  private Produto produto;

  public ItemPedido(Integer qtdSolicitada, Produto produto) {
    this.qtdSolicitada = qtdSolicitada;
    this.produto = produto;
  }

  public Integer getQtdSolicitada() {
    return qtdSolicitada;
  }

  public void setQtdSolicitada(Integer qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public double calcularSubtotal() {
    return this.produto.getValor() * this.qtdSolicitada;
  }

  @Override
  public String toString() {
    return (String.format("%d X %s | Subtotal R$ %.2f\n", this.qtdSolicitada, this.produto.getNome(),
        calcularSubtotal()));
  }

}

package user;

import entidades.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

  private String nome;
  private Endereco endereco;
  private List<Pedido> pedidos;

  public Cliente(String nome, Endereco endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.pedidos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void adicionarPedido(Pedido pedido) {
    this.pedidos.add(pedido);
  }

  @Override
  public String toString() {
    return String
        .format("Cliente: %s\nEndereço: %s, %s - %s\n", this.nome, endereco.getEndereco(), endereco.getBairro(),
            endereco.getCidade());
  }
}
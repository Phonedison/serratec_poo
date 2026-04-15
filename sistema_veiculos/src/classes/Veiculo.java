package classes;

import interfaces.Fretavel;
import interfaces.Tributavel;
import veiculos.Caminhao;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao {

  private final String placa;
  private final String marca;
  private final int anoFabricacao;

  public Veiculo(String placa, String marca, int anoFabricacao) {
    this.placa = placa;
    this.marca = marca;
    this.anoFabricacao = anoFabricacao;
  }

  public String getPlaca() {
    return placa;
  }

  public String getMarca() {
    return marca;
  }

  public int getAnoFabricacao() {
    return anoFabricacao;
  }

  @Override
  public void alugarVeiculo(double pesoCarga, int dias) {
    // TODO Auto-generated method stub

  }

  @Override
  public void calcularIpva() {

  }

}

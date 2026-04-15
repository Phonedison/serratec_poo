package classes;

import interfaces.Fretavel;
import interfaces.Tributavel;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {

  private final String placa;
  private final String marca;
  protected final int anoFabricacao;
  protected double valorLocacaoDiaria;
  protected double precoFipe;

  public Veiculo(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {
    this.placa = placa;
    this.marca = marca;
    this.anoFabricacao = anoFabricacao;
    this.valorLocacaoDiaria = valorLocacaoDiaria;
    this.precoFipe = precoFipe;
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

  public double getValorLocacaoDiaria() {
    return valorLocacaoDiaria;
  }

  public double getPrecoFipe() {
    return precoFipe;
  }

}

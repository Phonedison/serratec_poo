package classes;

import interfaces.Fretavel;
import interfaces.Tributavel;
import java.time.LocalDate;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, CarroPasseio {

  private final String placa;
  private final String marca;
  protected final int anoFabricacao;
  protected double valorLocacaoDiaria;
  protected double precoFipe;

  public Veiculo(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {

    if (placa == null || placa.isEmpty()) {
      throw new IllegalArgumentException("A placa do veículo não pode ser nula ou vazia.");
    }

    if (valorLocacaoDiaria < 0) {
      throw new IllegalArgumentException("O valor de locação diária não pode ser negativo.");
    }

    if (precoFipe < 0) {
      throw new IllegalArgumentException("O preço Fipe não pode ser negativo.");
    }

    if (anoFabricacao > LocalDate.now().getYear()) {
      throw new IllegalArgumentException("Ano de Fabricação inválido.");
    }

    if (marca == null || marca.isEmpty()) {
      throw new IllegalArgumentException("A marca do veículo não pode ser nula ou vazia.");
    }

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

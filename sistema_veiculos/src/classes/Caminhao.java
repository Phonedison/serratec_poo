package classes;

import java.time.LocalDate;

public final class Caminhao extends Veiculo {

  private final double capacidadeCargaToneladas;

  public Caminhao(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe,
      double capacidadeCargaToneladas) {

    super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);

    if (capacidadeCargaToneladas <= 0) {
      throw new RuntimeException("A capacidade de carga deve ser maior que zero.");

    }

    this.capacidadeCargaToneladas = capacidadeCargaToneladas;
  }

  @Override
  public double alugarVeiculo(double pesoCarga, int dias) {
    if (dias <= 0) {
      throw new RuntimeException("O número de dias deve ser maior que zero.");
    }

    if (pesoCarga <= 0) {
      throw new RuntimeException("O peso da carga deve ser maior que zero.");
    }

    double valorTotal = (this.valorLocacaoDiaria * dias);

    if (pesoCarga > this.capacidadeCargaToneladas) {
      valorTotal *= 1.1;
    }
    return valorTotal;
  }

  @Override
  public double calcularIpva() {

    int idade = LocalDate.now().getYear() - super.anoFabricacao;

    return ((idade > 20) ? 0.0 : super.precoFipe * 0.015);
  }

}

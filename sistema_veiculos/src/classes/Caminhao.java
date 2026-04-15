package classes;

import java.time.LocalDate;

public final class Caminhao extends Veiculo {

  private final double capacidadeCargaToneladas;

  public Caminhao(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe,
      double capacidadeCargaToneladas) {
    super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
    this.capacidadeCargaToneladas = capacidadeCargaToneladas;
  }

  @Override
  public void alugarVeiculo(double pesoCarga, int dias) {
    double valorTotal = valorLocacaoDiaria * dias;
    if (pesoCarga > capacidadeCargaToneladas) {
      System.out.println("Carga acima da capacidade! Aplicando taxa de 10%.");
      valorTotal *= 1.1;
    }
    System.out.println("Valor total do aluguel: " + valorTotal);
  }

  @Override
  public void calcularIpva() {

    double ipva;
    int idade = LocalDate.now().getYear() - super.anoFabricacao;

    if (idade > 20) {
      ipva = 0.0;

    } else {
      ipva = super.precoFipe * 0.015;
    }

    System.out.println("Valor do IPVA: R$" + String.format("%.2f", ipva));
  }

}

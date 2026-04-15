package classes;

import java.time.LocalDate;

public final class CarroPasseio extends Veiculo {

  public CarroPasseio(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {
    super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
  }

  @Override
  public double calcularIpva() {

    int idade = LocalDate.now().getYear() - super.anoFabricacao;

    return ((idade > 20) ? 0.0 : super.precoFipe * 0.04);
  }

  @Override
  public double alugarVeiculo(double pesoCarga, int dias) {

    if (dias <= 0) {
      throw new RuntimeException("O número de dias deve ser maior que zero.");
    }

    return valorLocacaoDiaria * dias;
  }

}

package classes;

import java.time.LocalDate;

public final class CarroPasseio extends Veiculo {

  public CarroPasseio(String placa, String marca, int anoFabricacao, double valorLocacaoDiaria, double precoFipe) {
    super(placa, marca, anoFabricacao, valorLocacaoDiaria, precoFipe);
  }

  @Override
  public void calcularIpva() {

    double ipva;
    int idade = LocalDate.now().getYear() - super.anoFabricacao;

    if (idade > 20) {
      ipva = 0.0;

    } else {
      ipva = super.precoFipe * 0.04;
    }

    System.out.println("Valor do IPVA: R$" + String.format("%.2f", ipva));
  }

  @Override
  public void alugarVeiculo(double pesoCarga, int dias) {
    double valorTotal = valorLocacaoDiaria * dias;
    System.out.println("Valor total do aluguel: R$" + String.format("%.2f", valorTotal));
  }

}

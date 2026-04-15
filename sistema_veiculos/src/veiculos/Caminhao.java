package veiculos;

import classes.Veiculo;

public final class Caminhao extends Veiculo {

  private final double capacidadeCargaToneladas;

  public Caminhao(String placa, String marca, int anoFabricacao, double capacidadeCargaToneladas) {
    super(placa, marca, anoFabricacao);
    this.capacidadeCargaToneladas = capacidadeCargaToneladas;
  }

}

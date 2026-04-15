import classes.Caminhao;
import classes.CarroPasseio;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("");
            Caminhao caminhaoNovo = new Caminhao("ABC-1234", "Volvo", 2010, 500.0, 200000.0, 10.0);
            System.out.print("Aluguel Caminhão (Carga 12t / 5 dias): R$ "
                    + String.format("%.2f", caminhaoNovo.alugarVeiculo(12, 5)) + " | ");
            System.out.println("IPVA Caminhão Novo: R$ " + String.format("%.2f", caminhaoNovo.calcularIpva()));

            Caminhao caminhaoAntigo = new Caminhao("ABC-1234", "Volvo", 1999, 500.0, 200000.0, 10.0);
            System.out.print("Aluguel Caminhão (Carga 12t / 5 dias): R$ "
                    + String.format("%.2f", caminhaoAntigo.alugarVeiculo(12, 5)) + " | ");
            System.out.println("IPVA Caminhão Antigo: R$ " + String.format("%.2f", caminhaoAntigo.calcularIpva()));
            System.out.println("");

            CarroPasseio carroNovo = new CarroPasseio("XYZ-0000", "Fusca", 2015, 100.0, 15000.0);
            System.out.println("IPVA Carro Novo: R$ " + String.format("%.2f", carroNovo.calcularIpva()));

            CarroPasseio carroAntigo = new CarroPasseio("XYZ-0000", "Fusca", 1970, 100.0, 15000.0);
            System.out.println("IPVA Carro Antigo: R$ " + String.format("%.2f", carroAntigo.calcularIpva()));

            // Testando exceção
            System.out.println("\nTestando validação de dados:");
            System.out.println("");
            Caminhao velho = new Caminhao("", "Erro", 2024, -10, 0, 5);
            System.out.println("");
            CarroPasseio carrinho = new CarroPasseio("XYZ-0000", "Fusca", -2020, -15, 15000.0);
            System.out.println("");

        } catch (IllegalArgumentException e) {
            System.err.println("Erro de Validação: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}

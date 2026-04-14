public class Separador {
   public void separadorTexto () {

    System.out.println("");
    System.out.println(" ================================================================================ ");
    System.out.println("");

  }

  public void tituloTexto (String titulo) {

    limparConsole();
    System.out.println("");
    System.out.println(" ================================= " + titulo + " ================================= ");
    System.out.println("");

  }

  // public void limparConsole()  {
  //     System.out.print("\033[H\033[2J");
  //     System.out.flush();
  // }

    public static void limparConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Em caso de erro, apenas imprima linhas em branco
            for (int i=0; i<50; i++) System.out.println();
        }
    }

}

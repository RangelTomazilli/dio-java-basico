public class Operadores {
  public static void main(String[] args) {
    String concatenacao = "Hello" + "World";
    System.out.println(concatenacao);

    concatenacao = 1 + 1 + 1 + 1 + "1"; // Soma os número e concatena com a string = 41
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1"; // Concatena os número com a string = 1111
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1) + "1"; // Concatena o número com as strings porém por precedência soma os números
                                        // dentro dos parênteses antes = 121
    System.out.println(concatenacao);

  }
}

public class CixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.00;
    double valorSolicitado = 26.0;

    if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
    } else {
      System.out.println("Saldo insuficiente para realizar o saque.");
    }
  }
}

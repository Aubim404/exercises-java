import java.util.Scanner;

public class TesteConta {
   public static void main(String args[]) {
      ContaCorrenteCheque cc1 = new ContaCorrenteCheque(12345, "John Snow", 0, 0);
      cc1.verDados();

      ContaCorrenteCheque cc2 = new ContaCorrenteCheque(54321, "Daenerys Targaryen", 0, 0);
      cc2.verDados();

      ContaCorrenteCheque cc3 = new ContaCorrenteCheque(99999, "Mick Jagger", 0, 0);
      cc3.verDados();

      ContaCorrenteCheque cc4 = new ContaCorrenteCheque(55555, "Morrissey", 0, 0);
      cc4.verDados();

      Scanner entrada = new Scanner(System.in);

      System.out.println("\nValor para deposito em c1: ");
      double vlr = entrada.nextDouble();
      cc1.deposito(vlr);
      cc1.verDados();

      System.out.println("\nValor de saque em c2: ");
      cc2.saque(entrada.nextDouble());
      cc2.verDados();

      System.out.println("\nValor de saque em c3: ");
      cc3.saque(entrada.nextDouble());
      cc3.verDados();

      System.out.println("\nValor de deposito em c4: ");
      cc4.deposito(entrada.nextDouble());
      cc4.verDados();

   }
}
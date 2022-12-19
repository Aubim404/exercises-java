import java.util.Scanner;
public class contabancaria {
    private static Scanner s;

    public static void main(String[] args) {
            s = new Scanner(System.in);
            int soma=0, dig, numero, alg, conta;
            System.out.println("Informe o número da conta sem o dígito: ");
            conta = s.nextInt();
            numero = conta;
            while (numero > 0) {
            alg = numero % 10;
            soma += alg;
            numero /= 10;
            }
            dig = soma % 10;
            System.out.println("Número de conta completo:\n" +"00"+conta + - +dig);
            System.out.println("Obrigada por utilizar meu programa");

}
}

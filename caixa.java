import java.util.Scanner;

public class caixa {
    private static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        double descontof, valorf = 0, itensf = 0;

        do {
            System.out.println("Informe o valor do produto que deseja comprar:");
            System.out.println("Para sair do menu digite 0");
            itensf = entrada.nextDouble();
            valorf = valorf + itensf;
        } while (itensf != 0);

        System.out.println("Total da compra é:" + valorf);
        if (valorf < 50) {
            descontof = valorf *= 0.95;
            System.out.println("O valor da compra com o desconto é:" + descontof);
        } else if (valorf <= 100) {
            descontof = (valorf *= 0.90);
            System.out.println("O valor da compra com o desconto é:" + descontof);
        } else if (valorf <= 200) {
            descontof = (valorf *= 0.85);
            System.out.println("O valor da compra com o desconto é:" + descontof);
        } else {
            descontof = (valorf *= 0.80);
            System.out.println("O valor da compra com o desconto é:" + descontof);
        }

    }
}

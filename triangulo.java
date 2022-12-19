import java.util.Scanner;

public class triangulo {
    private static Scanner s;

    public static void main(String[] args) {

        int a, b, c;
        s = new Scanner(System.in);
        System.out.println("Informe o valor do lado A:");
        a = s.nextInt();
        System.out.println("Informe o valor do lado B:");
        b = s.nextInt();
        System.out.println("Informe o valor do lado C:");
        c = s.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if (a == b && a == c) {
                System.out.println("Triângulo Equilatero");
            } else if ((a == b) || (a == c)) {
                System.out.println("Triângulo Isosceles");
            } else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não é um triângulo");
        }
        System.out.println("Obrigada por utilizar o meu programa.");
        System.exit(1);
    }
}

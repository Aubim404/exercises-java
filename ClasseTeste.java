import java.util.Scanner;
public class ClasseTeste {
    public static void main(String[] args) {
        System.out.println("Informe o raio");
        Scanner odeiojava = new Scanner(System.in);
        var armazenar = odeiojava.nextDouble();
        Circulo circulo = new Circulo(armazenar);
        circulo.exibeDados();
        odeiojava.close();
    }
}

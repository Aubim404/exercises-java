import java.util.Scanner;

class Salario {
    public static void main(String args[]) {
        System.out.println("Digite um numero de funcionários");
        Scanner sc = new Scanner(System.in);
        var funcionarios = sc.nextInt();
        var salario = 0.0;
        var maior = 0.0;
        var menor = 0.0;
        var media = 0.0;
        var acumula = 0.0;
        var entrada = 0.0;
        while (funcionarios == 0) {
            System.out.println("Digite um numero de funcionários válido");
            funcionarios = sc.nextInt();
        }
        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite o salário do funcionário: " + i);
            entrada = sc.nextDouble();
            salario += entrada;
            acumula = entrada;

            if (i == 0) {
                maior = entrada;
                menor = entrada;
            }
            if (entrada > acumula) {
                menor = entrada;
            } else {
                maior = acumula;
            }

            acumula = entrada;

        }
        acumula = entrada;
        media = salario / funcionarios;
        System.out.println("Informe o valor médio dos salários " + media);
        System.out.println("O maior salário digitado foi: " + maior);
        System.out.println("O menor salário digitado foi: " + menor);
        sc.close();
    }
}

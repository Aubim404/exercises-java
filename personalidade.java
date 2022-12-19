import java.util.Scanner;

public class personalidade {
    private static Scanner s;

    public static void main(String[] args) {
        int dia, mes, ano, semcerebro;

        s = new Scanner(System.in);

        System.out.println("Informe o dia que você nasceu");
        dia = s.nextInt();
        System.out.println("Informe o mês que você nasceu(em número)");
        mes = s.nextInt();
        System.out.println("Informe o ano que você nasceu");
        ano = s.nextInt();

        semcerebro = dia * 100 + mes + ano;
        switch ((semcerebro / 100 + semcerebro % 100) % 5) {
            case 0:
                System.out.println("tímido(a)");
                break;
            case 1:
                System.out.println("sonhador(a)");
                break;
            case 2:
                System.out.println("paquerador(a)");
                break;
            case 3:
                System.out.println("atraente(a)");
                break;
            case 4:
                System.out.println("irresistível(a)");
                break;
        }
    }
}
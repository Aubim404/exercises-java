import javax.swing.JOptionPane;
public class salarios {
    public static void main(String[] args) {
        int num = 0, maior = 0;
        double verificar = 0, total = 0, media = 0, menor = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de funcionários", "Numero", JOptionPane.QUESTION_MESSAGE));
        do {
        verificar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os salários", "Numero", JOptionPane.QUESTION_MESSAGE));
        total = verificar + total;
        if (verificar == 0) {
        System.out.println("Digite um salário válido"); }
        if (verificar > maior)
        {
            verificar = num;
        }
        else if (verificar < menor) 
        {
            menor = verificar;
        }
        } while (verificar == 999);
        media = total / num;
        System.out.println("Informe o valor médio dos salários " + media);
        System.out.println("O maior salário digitado foi: " + maior);
        System.out.println("O menor saláriodigitado foi: " + menor);
    }
}
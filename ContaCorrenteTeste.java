import java.util.Scanner;
public class ContaCorrenteTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumeroDaConta;
        String TitularDaConta;
        Double SaldoDaConta;
        Double Limite;  
        System.out.println("Informe o número da conta");
        NumeroDaConta = sc.nextInt();
        System.out.println("Informe o titular da conta");
        TitularDaConta = sc.next();
        sc.nextLine();
        System.out.println("Informe o saldo da Conta");
        SaldoDaConta = sc.nextDouble();
        System.out.println("O seu limite é de 1000 reais" );
        Limite = (double) 1000;
        ContaCorrente1 tristevida = new ContaCorrente1(NumeroDaConta, TitularDaConta,SaldoDaConta, Limite); 
        tristevida.VerDados();
        System.out.println("Valor para Saque ");
        tristevida.saque(sc.nextDouble());
        tristevida.VerDados();
        sc.close();
}
}



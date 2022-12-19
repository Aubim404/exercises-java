public class ContaCorrente1 {
    public int numeroDaConta;
    public String titular;
    public double saldo;
    public double Limite;

    public ContaCorrente1(int n, String t, double s, Double chequeEspecial) {
        setTitular(t);
        if (n < 0)
            System.out.printf("Numero de conta incorreta! Digite novamente.");
        else
            numeroDaConta = n;
        if (s < 0)
            System.out.printf("Saldo incorreto! Digite novamente");
        else
            saldo = s;
    }

    public void saque(double valorSaque) {
        if (valorSaque < 0 || (saldo + 1000) < valorSaque)
            System.out.printf("Valor de saque inválido! Digite novamente");
        else
            saldo = saldo - valorSaque;
    }

    public int getConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return Limite;
    }
    public void VerDados() {
        System.out.println("Conta :" + getConta());
        System.out.println("Nome  :" + getTitular());
        System.out.println("Saldo :" + getSaldo());
        System.out.println("Limite:" + 1000);
    }

    public void setTitular(String S) {
        titular = S;
    }
}
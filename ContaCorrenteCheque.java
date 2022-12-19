public class ContaCorrenteCheque {

   private int cc;
   private String nome;
   private double saldo;
   private double limite;

   // construtor
   // 1----------------------------------------------------------------------------
   public ContaCorrenteCheque(int cc, String nome, double saldo, double limite) {
      getConta();
      setConta(cc);
      getTitular();
      setTitular(nome);
      setSaldo(saldo);
      getSaldo();
      getLimite();
      setLimite(limite);
   }

   // construtor
   // 2------------------------------------------------------------------
   public ContaCorrenteCheque(int cc, String nome, double saldo) {
      getConta();
      setConta(cc);
      getTitular();
      setTitular(nome);
      setSaldo(saldo);
      getSaldo();
      getLimite();
      setLimite(1000.00);
   }

   // construtor
   // 3------------------------------------------------------------------
   public ContaCorrenteCheque(int cc, String nome) {
      getConta();
      setConta(cc);
      getTitular();
      setTitular(nome);
      setSaldo(0);
      getSaldo();
      getLimite();
      setLimite(0);
   }

   // getters----------------------------------------------------------------------------
   public double getSaldo() {
      return saldo;
   }

   public double getLimite() {
      return limite;
   }

   public int getConta() {
      return cc;
   }

   public String getTitular() {
      return nome;
   }

   // setters---------------------------------------------------------------------------
   private void setConta(int cc) {
      this.cc = cc;
   }

   private void setLimite(double limite) {
      this.limite = limite;
   }

   private void setSaldo(double saldo) {
      if (saldo < 0)
         System.out.println("======Atencao! O saldo inicial nao pode ser negativo!========");
      else
         this.saldo = saldo;
   }

   public void setTitular(String nome) {
      this.nome = nome;
   }

   // exibicao------------------------------------------------------------------------------------------
   public void verDados() {
      System.out.println("--------------------------------");
      System.out.println("Dados da conta");
      System.out.println("Titular: " + getTitular());
      System.out.println("Conta: " + getConta());
      System.out.println("Saldo: " + getSaldo());
      System.out.println("Saldo: " + getSaldo());
      System.out.println("Saldo: " + getLimite());
   }

   // operacoes na conta
   public void deposito(double valor) {
      if (valor < 0)
         System.out.println("Valor invalido, por favor deposite uma quantia maior ou igual a zero!");
      else
         saldo += valor;
   }

   public void saque(double valor) {
      if (valor < 0)
         System.out.println("*****Valor de saque invalido!******");
      else if (valor > saldo + limite)
         System.out.println("*****Voce nao tem recursos suficientes para sacar esse valor!*********");
      else
         saldo -= valor;
   }

}
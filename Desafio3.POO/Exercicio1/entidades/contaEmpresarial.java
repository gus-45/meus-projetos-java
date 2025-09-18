//Gustavo Monteiro


package entidades;

public class contaEmpresarial extends Conta {
  private double limiteEmprestimo;
  
  public contaEmpresarial() {
      super();
  }
  
  public contaEmpresarial(int numero, String titular, double saldo, double limeteEmprestimo) {
      super(numero, titular, saldo);
      this.limiteEmprestimo = limiteEmprestimo;
  }
  
  public double getlimiteEmprestimo() {
      return limiteEmprestimo;
  }
  
  public void setlimiteEmprestimo(double limiteEmprestimo) {
      this.limiteEmprestimo = limiteEmprestimo;
  }
  
  public void emprestar(double valorEmprestimo) {
      if(valorEmprestimo <= limiteEmprestimo) {
         saldo -= valorEmprestimo;
      }
  }
}
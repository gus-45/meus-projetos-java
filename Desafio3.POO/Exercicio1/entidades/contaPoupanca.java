//Gustavo Monteiro


package entidades;

public class contaPoupanca extends Conta {
  private double taxaJuros;
  
  public contaPoupanca() {
      super();
  }
  
  public contaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
      super(numero, titular, saldo);
      this.taxaJuros = taxaJuros;
  }
  
  public double gettaxaJuros() {
      return taxaJuros;
  }
  
  public void settaxaJuros(double taxaJuros) {
      this.taxaJuros = taxaJuros;
  }
  
  public void atualizarSaldo() {
      saldo += saldo * taxaJuros;
  }
  
  @Override
  public void sacar(double valorSaque) {
      if(valorSaque <= saldo) {
         super.sacar(valorSaque);
      }else{
         System.out.println(" Saldo insuficiente na Conta poupanca");
      }
  }

}
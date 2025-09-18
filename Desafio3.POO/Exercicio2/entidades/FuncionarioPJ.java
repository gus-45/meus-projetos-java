//Gustavo Monteiro


package entidades;

public class FuncionarioPJ extends Funcionario {
	
	private String cnpj;
	
	public FuncionarioPJ() {
		super();
	}
	
	public FuncionarioPJ(String nome, double salario, String cnpj) {
		super(nome, salario);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String imprimirDados() {
		return "Nome: " + getNome() 
			 + ", Salário: " + getSalario() 
			 + ", CNPJ: " + cnpj;
	}
}

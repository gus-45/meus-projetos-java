//Gustavo Monteiro


package entidades;

public class FuncionarioPF extends Funcionario {
	
	private String cpf;
	
	public FuncionarioPF() {
		super();
	}
	
	public FuncionarioPF(String nome, double salario, String cpf) {
		super(nome, salario);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String imprimirDados() {
		return "Nome: " + getNome() 
			 + ", Salário: " + getSalario() 
			 + ", CPF: " + cpf;
	}
}


public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
	}
	// m�todo sem implementa��o, sem corpo. N�o pode ser immplementado na classe m�e!
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

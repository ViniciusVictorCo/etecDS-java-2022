package revisao;

//definicão dos valores
public class Gerente {

		private String nome;
		private double salario;
		private int idFuncionario;
		private String email;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public int getIdFuncionario() {
		return this.idFuncionario;
	}
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario=idFuncionario;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public double getBonus() {
		return this.salario = this.salario * 0.10;
		
	public void imprimir() {
		System.out.println();
	}
	}
}

//sobreCarga
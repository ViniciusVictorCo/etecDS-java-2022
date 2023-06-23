package revisao;

public class funcionario {
	
	private String nome;
	private String CPF;
	private double salario;
	
	public void imprimir() {
		System.out.println(this.getnome());
		System.out.println(this.getCPF());
		System.out.println(this.getsalario());
	}
			public String getnome() {
			return this.nome;
			}
			public void setnome(String nome) {
				this.nome = nome;
			}
			
			public String getCPF() {
			return this.CPF;
			}
			public void setCPF(String CPF) {
				this.CPF = CPF;
			}
			
			public double getsalario() {
			return this.salario;
			}
			
			public void setsalario(double salario) {
				this.salario = salario;
			}
			
			// sobrecarga nome
			public void setnome (String nome, boolean caixaalta) {
				if(caixaalta) {
					this.nome = nome.toUpperCase();
				}else {
					this.nome = nome.toLowerCase();
				}		
			}
			
			public void setnome (String nome,boolean caixaalta, String primeirapalavra) {
				if(caixaalta) {
					this.nome = nome.toUpperCase();
				} else {
					this.nome = nome.toLowerCase();
				}
				
				if(primeirapalavra=="S") {
					this.nome = nome.split(" ")[0];
				}
			}
			
			public void setnome (String nome, String primeirapalavra) {
				if(primeirapalavra=="S")  {
					this.nome = nome.split(" ")[0];
				}
			}
			
			// sobrecarga salario
			public void getsalario (double salario ,String UsCoin)	{
				if (UsCoin=="US") {
					//em real
					this.salario =  salario * 5;
					System.out.println("Seu salario em real é de: R$"+this.getsalario());
				}else {
					//em dolar
					this.salario = salario;
					System.out.println("Seu salario em dolars é de: US$"+this.getsalario());
				}
			}
}


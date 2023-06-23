package revisao;

public class conta {
	private String nome;
	private int numero;
	private String CPF;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public int getNumero () {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF=CPF;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public void saque(double valor) {
		if(valor < saldo) {
			saldo=saldo-valor;
			System.out.println("seu saque foi realizado com sucesso: "+ valor + ", seu novo saldo é de: " + this.saldo);
		}else {
			System.out.println("saque invalido");
		}
	}
	
	public void deposito(double valor) {
		saldo=saldo+valor;
		System.out.println("seu saldo foi atualizado para: "+this.saldo);
	}
	
	public void imprimirSaldo() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Número: "+this.getNumero());
		System.out.println("Saldo: "+this.getSaldo());
	}
}

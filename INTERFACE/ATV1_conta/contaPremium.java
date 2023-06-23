package atividade_interface;

public class contaPremium extends conta implements tributacao{
	
	private double credito;
	
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito=credito;
	}
	
	
	@Override
	public void infoConta() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Número: "+this.getNumero());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Cr�ditos: "+this.getCredito());
	}

	@Override
	public double calcularImposto(double valor) {
		super.setSaldo(valor * 0.01);
		System.out.println("o valor do imposto sobre sua conta foi de: "+super.getSaldo());
		return super.getSaldo();
	}

}


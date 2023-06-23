package atividade_interface;

public class contaCorrente extends conta implements tributacao{

	public void sacar(double valorSaque) {
		
		if(super.getSaldo() < (valorSaque+5) ) {
			System.out.println("Saque Invalido, falta de dinheiro para tarifa");
		} else {
			valorSaque = super.getSaldo() - valorSaque;
			super.setSaldo(valorSaque);
			System.out.println("Saque efetuado com sucesso, sua conta corrente atual � de:" + super.getSaldo());
			valorSaque = valorSaque-5;
			System.out.println("O valor da tarifa foi de: "+valorSaque);
			
		}
	}
	
	
	@Override
	public void infoConta() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("N�mero: "+this.getNumero());
		System.out.println("Saldo: "+this.getSaldo());
	}

	@Override
	public double calcularImposto(double valor) {
		super.setSaldo(valor * 0.02);
		System.out.println("o valor do imposto sobre sua conta foi de: "+super.getSaldo());
		return super.getSaldo();
	}
}

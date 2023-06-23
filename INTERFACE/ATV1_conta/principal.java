package atividade_interface;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("----------------------CONTA--------------------------");

		conta vini = new conta();
		
		vini.setNome("Vinicius Victor");
		vini.setNumero(1);
		vini.setSaldo(200);
		
		vini.infoConta();
		vini.saque(300);
		vini.deposito(100);
		
		System.out.println("----------------------CONTA CORRENTE--------------------------");
		
		contaCorrente luiz = new contaCorrente();
		
		luiz.setNome("Luiz Vinicius");
		luiz.setNumero(2);
		luiz.setSaldo(200);
		
		luiz.infoConta();
		luiz.sacar(190);
		luiz.calcularImposto(100);
		
		System.out.println("----------------------CONTA POUPANCA--------------------------");
		
		contaPoupanca doni = new contaPoupanca();
		
		doni.setNome("Doni");
		doni.setNumero(3);
		doni.setSaldo(200);
		
		doni.infoConta();
		doni.atualizarSaldo(0.09);

		System.out.println("----------------------CONTA PREMIUM--------------------------");

		contaPremium thayani = new contaPremium();
		
		thayani.setNome("thayani");
		thayani.setNumero(4);
		thayani.setSaldo(200);
		thayani.setCredito(500);
		
		thayani.infoConta();
		thayani.calcularImposto(100);
		
	}

}
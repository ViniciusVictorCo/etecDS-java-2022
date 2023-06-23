package revisao;

public class principal {

	public static void main(String[] args) {
		
		conta vini = new conta();
		
		vini.setNome("Vinicius Victor");
		vini.setNumero(1);
		vini.setSaldo(200);
		
		vini.imprimirSaldo();
		vini.saque(300);
		vini.deposito(100);
		
		System.out.println("----------------------CONTA CORRENTE--------------------------");
		
		contaCorrente luiz = new contaCorrente();
		
		luiz.setNome("Luiz Vinicius");
		luiz.setTarifaMensal(10);
		luiz.setNumero(2);
		luiz.setSaldo(200);
		
		luiz.imprimirSaldo();
		luiz.Tarifa(10);
		
		System.out.println("----------------------CONTA POUPANÇA--------------------------");
		
		contaPoupanca doni = new contaPoupanca();
		
		doni.setNome("Doni");
		doni.setNumero(3);
		doni.setSaldo(200);
		
		doni.imprimirSaldo();
		doni.atualizarSaldo(0.01);
		
		System.out.println("----------------------LUCRO TOTAL--------------------------");
		
		lucros total = new lucros();

		total.registra(vini, luiz, doni);

	}

}

package revisao;

public class principal {

	public static void main(String[] args) {
		
		conta vini = new conta();
		
		vini.setNome("Vinicius Victor");
		vini.setNumero(1);
		vini.setAgencia("Bradesco");
		vini.setSaldo(200);
		
		vini.info();
		vini.saque(300);
		vini.deposito(100);
		
		System.out.println("----------------------CONTA CORRENTE--------------------------");
		
		contaCorrente luiz = new contaCorrente();
		
		luiz.setNome("Luiz Vinicius");
		luiz.setLimite(1000);
		luiz.setNumero(2);
		luiz.setAgencia("C6");
		luiz.setSaldo(200);
		
		luiz.info();
		luiz.saque(300);
		
		System.out.println("----------------------CONTA POUPANÇA--------------------------");
		
		contaPoupanca doni = new contaPoupanca();
		
		doni.setNome("Doni");
		doni.setNumero(3);
		doni.setAgencia("Itaú");
		doni.setSaldo(200);
		
		doni.info();
		doni.saque(0.12);
	}

}

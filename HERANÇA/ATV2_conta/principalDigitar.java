package revisao;

import java.util.Scanner;

public class principalDigitar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int numero;
		String agencia;
		double saldo;
		
		conta vini = new conta();
		
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		vini.setNome(nome);
		
		vini.setNumero(1);

		System.out.println("Digite a sua agência: ");
		agencia = in.next();
		vini.setAgencia(agencia);
		
		vini.setSaldo(1000);
		
		vini.info();

	}

}

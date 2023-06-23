package revisao;

import java.util.Scanner;

public class Conta_Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
	
		//conta 
		
			Conta continha = new Conta();
				
			System.out.println("digite o nome do titular:");
			continha.titular = in.next();
			
			System.out.println("digite o número da agência:");
			continha.agencia = in.nextInt();
			
			System.out.println("digite o número da conta:");
			continha.conta = in.nextInt();
			
			System.out.println("digite o número do saldo de sua conta:");
			continha.saldo = in.nextDouble();
					
			continha.conta();
		 
		//conta corrente
		 
		 	Conta continhaCorrente = new Conta();
		 	
		 	System.out.println("digite o nome do titular da C/C:");
			continhaCorrente.titular = in.next();
			
			System.out.println("digite o número da agência:");
			continhaCorrente.agencia = in.nextInt();
			
			System.out.println("digite o seu crédito total da C/C:");
			continhaCorrente.credito = in.nextInt();
			
			System.out.println("digite o número do saldo de sua conta da C/C:");
			continhaCorrente.saldo = in.nextDouble();

			continhaCorrente.contacorrente();
	}
}

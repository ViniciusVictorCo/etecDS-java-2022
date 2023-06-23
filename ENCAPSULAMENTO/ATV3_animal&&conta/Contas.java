package revisao;

import java.util.Scanner;

public class Conta {
		
		String titular;
		double saldo, deposito, saque, credito;
		double taxa=35.50;
		int agencia, conta;
		int i=0;
		
		Scanner in = new Scanner (System.in);
		
		void conta () {
			double depResultado, saqResultado, taxaResultado;
			
			System.out.println("digite 1 para deposito, 2 para saque, 3 para consulta e 4 para ver a taxa da conta");
			i = in.nextInt();
			
			//operação deposito//
			
			if (i==1){ 
				System.out.println("digite o saldo que deseja depositar:");
				deposito = in.nextDouble();

			depResultado = saldo + deposito; 
			System.out.println("o seu saldo de " + saldo + "$ foi atualizado para " + depResultado +"$");
			
			//operação saque//

			} else if (i==2) {
				
				System.out.println("digite o saldo que deseja sacar:");
				saque = in.nextDouble();
				
			saqResultado = saldo - saque;
			System.out.println("você sacou " + saque + "$" + " sua conta agora tem " + saqResultado + "$");
			
			//operação consulta//

			} else if (i==3) {
			
				System.out.println("seu saldo atual é de:" + saldo);
				
			//operação taxa conta//
				
			} else {
				
				System.out.println("a taxa de " + taxa + " reais foi cobrada, assim deixando sua conta com " + saldo + " reais");
			}

		}
		
		void contacorrente () {
			double depResultado, saqResultado, taxaResultado;
			
			System.out.println("digite 1 para deposito, 2 para saque, 3 para consulta e 4 para ver a taxa da conta");
			i = in.nextInt();
			
			//operação deposito//
			
			if (i==1){ 
				System.out.println("digite o saldo que deseja depositar:");
				deposito = in.nextDouble();

			depResultado = saldo + deposito; 
			System.out.println("o seu saldo de " + saldo + "$ foi atualizado para " + depResultado +"$");
			
			//operação saque//

			} else if (i==2) {
				
				System.out.println("digite o saldo que deseja sacar:");
				saque = in.nextDouble();
				
			saqResultado = saldo - saque;
			System.out.println("você sacou " + saque + "$" + " sua conta agora tem " + saqResultado + "$");
			
			//operação consulta//

			} else if (i==3) {
			
				System.out.println("seu saldo atual é de:" + saldo);
				
			//operação taxa conta//
				
			} else {
				
				System.out.println("a taxa de " + taxa + " reais foi cobrada, assim deixando sua conta com " + saldo + " reais");
			}

		}
}
		
		



package revisao;

import java.util.Scanner;

public class Animal_Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
				int i;
			Animal info = new Animal();
			
			for (i=0; i<=2; i++) {
				
			System.out.println("digite o nome do animal:");
			info.nome = in.next();
			
			System.out.println("digite a especie do animal:");
			info.especie = in.next();
			
			System.out.println("digite a quantidade de patas:");
			info.patas = in.nextInt();
			
			System.out.println("digite o peso do animal:");
			info.peso = in.nextDouble();
			
		 info.info();
			}
			
		
	}
}

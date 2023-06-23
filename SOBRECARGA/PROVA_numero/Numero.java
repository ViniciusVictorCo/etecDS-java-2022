package prova2;

public class Numero {
	int num1, num2, num3;
	
	public  void numPrimo(int num1 ) {
		if((num1%2!=0) && (num1%3!=0)) {
			System.out.println("O Número "+ num1+" é primo");
		}else {
			System.out.println("O Número "+ num1+" não é primo");
		}
		
	}
	
	public  void numPrimo(int num1, int num2 ) {
		if((num1/2!=0) && (num1%3!=0)) {
			System.out.println("O 1° "+ num1+" Número é primo");
		}
		else {
			System.out.println("O 1° "+ num1+" Número não é primo");
		}
		
		if((num2/2!=0) && (num2%3!=0)) {
			System.out.println("O 2° "+ num2+" Número não é primo");
		}
		else {
			System.out.println("O 2° "+ num2+" Número é primo");
		}
		
	}
		public  void numPrimo(int num1, int num2 ,int num3) {
			if((num1/2!=0) && (num1%3!=0)) {
				System.out.println("O 1° "+ num1+" Número é primo");
			}
			else {
				System.out.println("O 1° "+ num1+" Número não é primo");
			}
			
			if((num2/2!=0) && (num2%3!=0)) {
				System.out.println("O 2° "+ num2+" Número não é primo");
			}
			else {
				System.out.println("O 2° "+ num2+" Número é primo");
			}
			if((num3/2!=0) && (num3%3!=0)) {
				System.out.println("O 3° "+ num3+" Número não é primo");
			}
			else {
				System.out.println("O 3° "+ num3+" Número é primo");
			}
		
	}
	
	
	
}

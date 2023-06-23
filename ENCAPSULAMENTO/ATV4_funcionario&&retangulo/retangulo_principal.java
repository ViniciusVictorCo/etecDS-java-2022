package pratica;

import java.util.Scanner;

public class retangulo_principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			retangulo retangulo1 = new retangulo();
			System.out.println("digite a sua base");
			retangulo1.base = in.nextDouble();
			System.out.println("digite a sua altura");
			retangulo1.altura = in.nextDouble();
			retangulo1.calculaArea();
	
	
			retangulo retangulo2 = new retangulo();
			System.out.println("digite a sua segunda base");
			retangulo2.base = in.nextDouble();
			System.out.println("digite a sua segunda altura");
			retangulo2.altura = in.nextDouble();
			retangulo2.calculaArea();
	}
}

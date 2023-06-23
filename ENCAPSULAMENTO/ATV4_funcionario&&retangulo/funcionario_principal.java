package revisao;

import java.util.Scanner;

public class funcionario_principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
			//parte do Perdo
		
			funcionario pedro = new funcionario();
			
			System.out.println("escreva seu nome.");
			pedro.nome = in.next();
			
			System.out.println("digite seu salario bruto.");
			pedro.salarioBruto = in.nextDouble();
			
			System.out.println("digite o imposto que você paga.");
			pedro.imposto = in.nextDouble();
			
			pedro.calculoComissao();
			
			//parte do Vagner
			
			funcionario vagner = new funcionario();
			
			System.out.println("escreva seu nome.");
			vagner.nome = in.next();
			
			System.out.println("digite seu salario bruto.");
			vagner.salarioBruto = in.nextDouble();
			
			System.out.println("digite o imposto que você paga.");
			vagner.imposto = in.nextDouble();
			
			vagner.calculoComissao();

	}

}

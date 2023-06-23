package revisao;

import java.util.Scanner;

public class principalDigitar {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String nome;
		int idade;
		String endereco;

		
		//cliente Vini
		cliente vini = new cliente();
		
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		vini.setNome(nome);
		
		System.out.println("Digite a sua idade: ");
		idade = in.nextInt();
		vini.setIdade(idade);
		
		System.out.println("Digite o seu endereço: ");
		endereco = in.next();
		vini.setEndereco(endereco);
		
		vini.setValorPedido(100);
		System.out.println("O valor do desconto foi de : R$"+vini.calculaDesconto());
		
		//clientePremium Luiz
		clientePremium luiz = new clientePremium();
		
		System.out.println("Digite o seu nome: ");
		nome = in.next();
		luiz.setNome(nome);
		
		System.out.println("Digite a sua idade: ");
		idade = in.nextInt();
		luiz.setIdade(idade);
		
		System.out.println("Digite o seu endereço: ");
		endereco = in.next();
		luiz.setEndereco(endereco);
		
		luiz.setValorPedido(100);
		System.out.println("O valor do desconto foi de : R$"+luiz.calculaDesconto());
	}

}

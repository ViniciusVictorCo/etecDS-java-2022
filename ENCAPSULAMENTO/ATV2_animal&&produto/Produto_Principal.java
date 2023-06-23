package revisao;

import java.util.Scanner;

public class Produto_Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double precoCusto, precoVenda;
		
		Produto itens = new Produto();
			System.out.println("Insira o nome do produto:");
			nome=in.next();
			itens.setnomeProduto(nome);
			
			System.out.println("Insira o valor de custo do produto:");
			precoCusto=in.nextDouble();
			itens.setprecoCusto(precoCusto);
			
			System.out.println("Valor de Venda do produto:");
			precoVenda=in.nextDouble();
			itens.setprecoVenda(precoVenda);
			
			if(precoVenda>precoCusto) {
				itens.setprecoVenda(precoVenda);
			} else {
				while (precoVenda<precoCusto) {
					System.out.println("O valor de venda deve ser maior que o custo.");
					System.out.println("Insira novamente.");
					precoVenda=in.nextDouble();
				}
				itens.setprecoVenda(precoVenda);
			}
			
			itens.calcularMargemLucro();
			
			System.out.println("Nome do produto: " + itens.getnomeProduto());
			System.out.println("Custo do produto: R$" + itens.getprecoCusto());
			System.out.println("Venda do produto: R$" + itens.getprecoVenda());
			System.out.println("Margem de lucro do produto: R$" + itens.getmargemLucro());
			System.out.println("Porcentagem de margem de lucro: " + itens.getMargemLucroPorcentagem() + "%");
	}

}

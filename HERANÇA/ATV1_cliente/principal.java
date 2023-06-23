package revisao;

public class principal {

	public static void main(String[] args) {
		
		cliente vini = new cliente();
		
		vini.setNome("Vinicius Victor");
		vini.setIdade(16);
		vini.setEndereco("rua da Sorte vida loka 123");
		vini.setValorPedido(30);
		System.out.println("Nome: "+vini.getNome());
		System.out.println("Idade: "+vini.getIdade());
		System.out.println("Endereço: "+vini.getEndereco());
		System.out.println("O valor do desconto foi de : R$"+vini.calculaDesconto()+"\n");
		
		clientePremium luiz = new clientePremium();
		
		luiz.setNome("Luiz Vinicius");
		luiz.setIdade(16);
		luiz.setEndereco("marginal tiete de baixo da ponte 321");
		luiz.setValorPedido(100);
		System.out.println("Nome: "+luiz.getNome());
		System.out.println("Idade: "+luiz.getIdade());
		System.out.println("Endereço: "+luiz.getEndereco());
		System.out.println("O valor do desconto foi de : R$"+luiz.calculaDesconto());
	}

}

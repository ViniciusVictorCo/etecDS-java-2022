package revisao;

public class cliente {

		private String nome;
		private int idade;
		private String endereco;
		private double valorPedido;
		private double desconto;
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome=nome;
		}
		
		public int getIdade() {
			return idade;	
		}
		
		public void setIdade(int idade) {
			this.idade=idade;
		}
		
		public String getEndereco() {
			return endereco;
		}
		
		public void setEndereco(String endereco) {
			this.endereco=endereco;
		}
		
		public double getValorPedido() {
			return valorPedido;	
		}
		
		public void setValorPedido(double valorPedido) {
			this.valorPedido=valorPedido;
		}
		
		public double getDesconto() {
			return desconto;	
		}
		
		public void setDesconto(double desconto) {
			this.desconto=desconto;
		}
		
		public double calculaDesconto() {
			return this.valorPedido * 0.10;
		}
		
}

package revisao;

public class contaPoupanca extends conta{
		
		private double rendimento;
		
		public double getRendimento() {
			return rendimento;
		}
		public void setRendimento(double rendimento) {
			this.rendimento=rendimento;
		}
		
		public void atualizarSaldo(double rendimento) {
			rendimento = this.getSaldo() * rendimento;
			this.setSaldo(this.getSaldo()+ rendimento);
			System.out.println("Seu rendimento anual foi de: R$" + rendimento + ", seu saldo agora é de: R$" + this.getSaldo());
			}
		
		@Override
		public void imprimirSaldo() {
			System.out.println("Nome: "+this.getNome());
			System.out.println("Número: "+this.getNumero());
			System.out.println("Saldo: "+this.getSaldo());
		}
}

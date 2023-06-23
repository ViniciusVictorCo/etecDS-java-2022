package revisao;

public class lucros {
	
	private double soma;
		
		public double getSoma() {
			return soma;
		}
		public void setSoma(double soma) {
			this.soma=soma;
		}

		
		public void registra (conta c, contaCorrente cc, contaPoupanca p ) {
			c.getSaldo();
			cc.getSaldo();
			p.getSaldo();
			
			soma= c.getSaldo() + cc.getSaldo() + p.getSaldo();
			System.out.println("A soma total dos lucros foi de: "+soma);
		}
}

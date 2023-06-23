package revisao;

public class contaCorrente extends conta{
	
	private double limite;
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite=limite;
	}
	
	@Override
	public void saque(double valor) {
		valor=super.getSaldo()-valor;
		if (valor < 0) {
			limite = limite + valor;
			System.out.println("seu limite de credito foi atualizado: "+ limite);
			}else {
				super.setSaldo(valor); 
				System.out.println("seu saldo foi atualizado: " + super.getSaldo());
			}
		}
	//	super.setSaldo(super.getSaldo()-valor);
		/*if(valor < super.getSaldo()) {
			
			System.out.println("seu saque foi realizado com sucesso: "+ valor + ", seu novo saldo é de: " + super.getSaldo());
		}else {
			System.out.println("saque invalido");
		}*/
	
	@Override
	public void info() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Número: "+this.getNumero());
		System.out.println("Agência: "+this.getAgencia());
		System.out.println("Saldo: "+this.getSaldo());
	}
}


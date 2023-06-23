package revisao;

public class contaCorrente extends conta{
	
	private double tarifaMensal;
	
	public double getTarifaMensal() {
		return tarifaMensal;
	}
	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal=tarifaMensal;
	}
	
	public void Tarifa(double tarifaMensal) {
		tarifaMensal=super.getSaldo()-tarifaMensal;
				super.setSaldo(tarifaMensal); 
				System.out.println("A tarifa foi descontada: " + super.getSaldo());
		}
	
	
	@Override
	public void imprimirSaldo() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Número: "+this.getNumero());
		System.out.println("Saldo: "+this.getSaldo());
	}
}


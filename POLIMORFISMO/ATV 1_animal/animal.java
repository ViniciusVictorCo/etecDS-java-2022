package revisao;

public class animal {
	
	private String cor, nome;
	private double tamanho;
	
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	
	//
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	//
	
	public double getTamanho() {
		return this.tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho=tamanho;
	}
	
	//metodos
	public double correr(double velocidade) {
		return velocidade;
	}
	
	public String comer(String comida) {
		return comida;
	}
	
	public void dormir(double dormir) {
		
	}
	
	public String emitirSom(String som) {
		return som;
	}
	
	public void caracteristicas() {
		System.out.println(this.getNome() +" atinge a velecidade de " + this.correr(20) +" Km");
		System.out.println(this.getNome() +" se alimentam de " + this.comer("ração"));
		System.out.println("o som emitido pelo" + this.getNome() +"é: "+ this.emitirSom("AU-AU-AU"));

	}
}

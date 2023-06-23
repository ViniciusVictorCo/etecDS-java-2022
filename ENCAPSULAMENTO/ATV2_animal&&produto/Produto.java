package revisao;

public class Produto {

	private String nomeProduto;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	public String getnomeProduto() {
		return nomeProduto;
	}
	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto=nomeProduto;
	}
	
	public double getprecoCusto() {
		return precoCusto;
	}
	public void  setprecoCusto(double precoCusto) {
		this.precoCusto=precoCusto;
	}
	
	public double getprecoVenda() {
		return precoVenda;
	}
	public void setprecoVenda(double precoVenda) {
		this.precoVenda=precoVenda;
	}
	
	public double getmargemLucro() {
		return margemLucro;
	}
	public void calcularMargemLucro() {
		this.margemLucro=this.precoVenda-this.precoCusto;
	}
	
	public double getMargemLucroPorcentagem() {
		return this.margemLucro/this.precoCusto*100;
	}
	
}

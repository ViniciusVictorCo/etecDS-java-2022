package revisao;

public class filme extends conteudo{

	private double duracao;

	public filme(String categoria, String titulo, double duracao) {
		super.setCategoria(categoria);
		super.setTitulo(titulo);
		this.duracao=duracao;
	}
	
	public double setDuracao() {
		return duracao;
	}
	public void getDuracao(double duracao) {
		this.duracao=duracao;
	}
	
	@Override
	public void descricao() {
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Titulo do Filme: "+this.getTitulo());
		System.out.println("Duração: "+this.duracao);
	}

}


package revisao;

public class serie extends conteudo{

	private double duracao;
	private int quantEpisodios;
	private int quantTemps;

	public serie(String categoria, String titulo, double duracao, int quantEpisodios, int quantTemps) {
		super.setCategoria(categoria);
		super.setTitulo(titulo);
		this.duracao=duracao;
		this.quantEpisodios=quantEpisodios;
		this.quantTemps=quantTemps;
	}
	
		public double setDuracao() {
			return duracao;
		}
		public void getDuracao(double duracao) {
			this.duracao=duracao;
		}

		public int setquantEpisodios() {
			return quantEpisodios;
		}
		public void getquantEpisodios(int quantEpisodios) {
			this.quantEpisodios=quantEpisodios;
		}
		
		public int setquantTemps() {
			return quantEpisodios;
		}
		public void getquantTemps(int quantTemps) {
			this.quantTemps=quantTemps;
		}
	
	@Override
	public void descricao() {
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Titulo do Filme: "+this.getTitulo());
		System.out.println("Duração: "+this.duracao);
		System.out.println("Quantidades de Episódios: "+this.quantEpisodios);
		System.out.println("Quantidades de Temporadas: "+this.quantTemps);

	}

}

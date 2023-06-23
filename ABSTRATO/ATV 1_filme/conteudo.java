package revisao;

public  class conteudo {

	private String categoria;
	private String titulo;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void descricao() {
		System.out.println(this.getCategoria());
		System.out.println(this.getTitulo());	
	}
}

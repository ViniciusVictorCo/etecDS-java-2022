package pessoa;

public class pessoa {
	
	//atributo
	
	public String nome;
	public double altura;
	
	
	//assesores
	pessoa(){}
	
	pessoa(String nome, double altura){
	this.nome=nome;
	this.altura=altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public  void imprimirPessoa() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Altura: "+this.getAltura());
	}
	
	//sobrecarga
	
	public void imprimirFrase() {
	System.out.println("Salve cachorro" );

	}
	
	public void imprimirFrase(String Frase) {
		System.out.println(Frase);
	}
	
	
}

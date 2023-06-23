package revisao;

public class principal {

	public static void main(String[] args) {
		
		System.out.println("-------------------CACHORRO-------------------");
		
		animal a1 = new cachorro();
		
		a1.setNome("doguinho");		
		a1.setCor("preto");
		a1.setTamanho(1.20);
		
		a1.caracteristicas();
		
		System.out.println("-------------------GATO--------------------");
		
		animal a2 = new gato();
		
		a2.setNome("gato");		
		a2.setCor("branco");
		a2.setTamanho(0.20);
		
		a2.caracteristicas();
		
		System.out.println("-------------------ELEFANTE---------------------");
		
		animal a3 = new elefante();
		
		a3.setNome("elefante");		
		a3.setCor("rosa");
		a3.setTamanho(5);
		
		a3.caracteristicas();

	}

}

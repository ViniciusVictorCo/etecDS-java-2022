package revisao;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conteudo catalogo[] = new conteudo [10];
		
		catalogo[0] = new filme("filme","Ninja",140);
		catalogo[1] = new filme("filme","Karate-Kid",180);
		catalogo[2] = new serie("serie","Cobra-Kai", 260, 28, 4);
		catalogo[3] = new serie("serie","Sintonia",200, 20, 4);
		catalogo[4] = new serie("serie","The Walking Dead", 450, 50, 10);
		catalogo[5] = new serie("serie","YOU",275, 26, 3);
		catalogo[6] = new serie("serie","The Boys",210, 21, 4);
		catalogo[7] = new filme("filme","Velozes e Furiosos",210);
		catalogo[8] = new filme("filme","Batman",280);
		catalogo[9] = new filme("filme","Para todos os garotos que ja amei",145);
		
	
			for(int j = 0; j < catalogo.length; j++) {
			catalogo[j].descricao();
			System.out.println("------------------------------------");
			}

	}

}

import java.util.Scanner;

public class TesteFilme_principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nomeFilme;
		double duraçãoFilmeMin, duraçãoFilmeHora = 0;
		
	//filme 1
		TesteFilme filme1 = new TesteFilme();
		System.out.println("---------filme 1------------");

		filme1.setnomeFilme("velozes e furiosos");
		System.out.println("filme: " +filme1.getnomeFilme());
		
		System.out.println("digite os minutos do filme;");
		duraçãoFilmeMin=in.nextDouble();
		filme1.setduraçãoFilmeMin(duraçãoFilmeMin);
		
		filme1.exibirduraçaohora(duraçãoFilmeHora);
		
		System.out.println("duração: "+ filme1.duraçãoFilmeHora()+"h");
		System.out.println("---------filme 2------------");

	//filme 2
		TesteFilme filme2 = new TesteFilme();
		
		filme2.setnomeFilme("era do gelo");
		System.out.println("filme: " +filme2.getnomeFilme());
		
		System.out.println("digite os minutos do filme;");
		duraçãoFilmeMin=in.nextDouble();
		filme2.setduraçãoFilmeMin(duraçãoFilmeMin);
		
		filme2.exibirduraçaohora(duraçãoFilmeHora);
		
		System.out.println("duração: "+ filme2.duraçãoFilmeHora()+"h");
		System.out.println("---------filme 3------------");

	//filme 3
		TesteFilme filme3 = new TesteFilme();
		
		filme3.setnomeFilme("frozen");
		System.out.println("filme: " +filme3.getnomeFilme());
		
		System.out.println("digite os minutos do filme;");
		duraçãoFilmeMin=in.nextDouble();
		filme3.setduraçãoFilmeMin(duraçãoFilmeMin);
		
		filme3.exibirduraçaohora(duraçãoFilmeHora);
		
		System.out.println("duração: "+ filme3.duraçãoFilmeHora()+"h");

		System.out.println("---------filme 4------------");

				
	//filme 4
		TesteFilme filme4 = new TesteFilme();
		
		filme4.setnomeFilme("carros 2");
		System.out.println("filme: " +filme4.getnomeFilme());
		
		System.out.println("digite os minutos do filme;");
		duraçãoFilmeMin=in.nextDouble();
		filme4.setduraçãoFilmeMin(duraçãoFilmeMin);
		
		filme4.exibirduraçaohora(duraçãoFilmeHora);
		
		System.out.println("duração: "+ filme4.duraçãoFilmeHora()+"h");
		System.out.println("---------filme 5------------");
		
	//filme 5
		TesteFilme filme5 = new TesteFilme();
		
		filme5.setnomeFilme("toy story");
		System.out.println("filme: " +filme5.getnomeFilme());
		
		System.out.println("digite os minutos do filme;");
		duraçãoFilmeMin=in.nextDouble();
		filme5.setduraçãoFilmeMin(duraçãoFilmeMin);
		
		filme5.exibirduraçaohora(duraçãoFilmeHora);
		
		System.out.println("duração: "+ filme5.duraçãoFilmeHora()+"h");
		
		System.out.println("Todos os filmes em cartazes são " +filme1.getnomeFilme()+ ", " +filme2.getnomeFilme()+ ", "+filme3.getnomeFilme()+", "+filme4.getnomeFilme()+", " +filme5.getnomeFilme());
	}
}

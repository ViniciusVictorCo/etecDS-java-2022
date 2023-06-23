
public class TesteFilme {
	private String nomeFilme;
	private double duraçãoFilmeMin;
	private double duraçãoFilmeHora;


public TesteFilme () {
	this.nomeFilme=nomeFilme;
	this.duraçãoFilmeMin=duraçãoFilmeMin;
	this.duraçãoFilmeHora=duraçãoFilmeHora;
}

//nomeFilme
public void setnomeFilme(String nomeFilme) {
	this.nomeFilme=nomeFilme;
}
public String getnomeFilme() {
	return nomeFilme;
}

//duraçãoFilmeMin
public void setduraçãoFilmeMin(double duraçãoFilmeMin) {
	this.duraçãoFilmeMin=duraçãoFilmeMin;
}
public double getduraçãoFilmeMin() {
	return duraçãoFilmeMin;
}

//duraçãoFilmeHora
public void exibirduraçaohora(double duraçãoFilmeHora) {
	this.duraçãoFilmeHora=this.duraçãoFilmeMin/60;
	}

public double duraçãoFilmeHora() {
	return duraçãoFilmeHora;

}
}


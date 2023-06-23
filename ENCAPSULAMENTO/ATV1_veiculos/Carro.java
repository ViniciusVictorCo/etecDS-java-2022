package revisao;

public class carro {
	public String modelo;
	private String CHASSI;
	protected String CNH;
	
public carro() {
	this("","","");
	}

public carro(String modelo, String CHASSI, String CNH) {
	this.modelo=modelo;
	this.CHASSI=CHASSI;
	this.CNH=CNH;
	}

public String getmodelo() {
	return modelo;
	}

public void getmodelo(String modelo) {
	this.modelo=modelo;
	}

private String getCHASSI() {
	return CHASSI;
	}

private void getCHASSI(String CHASSI) {
	this.CHASSI=CHASSI;
	}

protected String getCNH() {
	return CNH;
	}

protected void getCNH(String CNH) {
	this.CNH=CNH;
	}

public void apresentarCarro() {
	System.out.println("modelo : "+this.getmodelo());
	System.out.println("CHASSI : "+this.getCHASSI());
	System.out.println("CNH : "+this.getCNH());
}
}
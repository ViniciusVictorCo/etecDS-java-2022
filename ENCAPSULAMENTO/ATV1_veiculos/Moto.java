package revisao;

public class moto {
	public String modelo;
	private String CPF;
	protected String CNH;

public moto() {
	this("","","");
}

public moto(String modelo, String CPF, String CNH) {
	this.modelo=modelo;
	this.CPF=CPF;
	this.CNH=CNH;
}

public String getmodelo() {
	return modelo;
}

public void getmodelo(String modelo) {
	this.modelo=modelo;
}

private String getCPF() {
	return CPF;
}

private void getCPF(String CPF) {
	this.CPF=CPF;
}

protected String getCNH() {
	return CNH;
}

protected void getCNH(String CNH) {
	this.CNH=CNH;
}

public void apresentarMoto () {
	System.out.println("modelo : "+ this.getmodelo());
	System.out.println("CPF : "+ this.getCPF());
	System.out.println("CNH : "+ this.getCNH());
}
}
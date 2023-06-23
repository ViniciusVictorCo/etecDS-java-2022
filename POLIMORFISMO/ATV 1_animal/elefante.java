package revisao;

public class elefante extends animal{
	
	@Override
	public void caracteristicas() {
		System.out.println(this.getNome() +" atinge a velecidade de " + this.correr(5) +" Km");
		System.out.println(this.getNome() +" se alimentam de " + this.comer("Água"));
		System.out.println("o som emitido pelo" + this.getNome() +"é: "+ this.emitirSom("FOOOOOOOONNNNNN"));

	}
}

package revisao;

public class cachorro extends animal{

	@Override
	public void caracteristicas() {
		System.out.println(this.getNome() +" atinge a velecidade de " + this.correr(20) +" Km");
		System.out.println(this.getNome() +" se alimentam de " + this.comer("ração"));
		System.out.println("o som emitido pelo" + this.getNome() +"é: "+ this.emitirSom("AU-AU-AU"));

	}
}

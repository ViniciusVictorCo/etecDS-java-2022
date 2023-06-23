package revisao;

public class gato extends animal{
	
	@Override
	public void caracteristicas() {
		System.out.println(this.getNome() +" atinge a velecidade de " + this.correr(40) +" Km");
		System.out.println(this.getNome() +" se alimentam de " + this.comer("peixe"));
		System.out.println("o som emitido pelo" + this.getNome() +"é: "+ this.emitirSom("MIAAAAAAAAAAU"));

	}
}

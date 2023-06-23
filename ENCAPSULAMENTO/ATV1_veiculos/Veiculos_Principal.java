package revisao;

public class Veiculos_Principal {

	public static void main(String[] args) {
		carro car = new carro("volkswagen", "9BG116GW04C400001", "0000000001");
		car.apresentarCarro();
		
		System.out.println("------------------------------------");
		
		moto bike = new moto("honda", "123-456-789-10", "0000000002");
		bike.apresentarMoto();
		
		System.out.println("------------------------------------");
		
		caminhao truck = new caminhao("mercedez-benz", "9BWHE21JX24060960", "0000000003");
		truck.apresentarCaminhao();
	}

}

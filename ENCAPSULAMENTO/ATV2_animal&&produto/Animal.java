package revisao;

public class Animal {
		
		public String nome, especie;
		public double peso;
		public int patas = 0;
		
		public Animal() {
		}
		
		public Animal(String nome, String especie, double peso, int patas) {
			this.nome=nome;
			this.especie=especie;
			this.peso=peso;
			this.patas=patas;
		}
		
		public String setnome () {
			return nome;	
		}
		
		public void setnome(String nome) {
			this.nome=nome;
		}
		
		public String getespecie() {
			return especie;
		}
		
		public void getespecie(String especie) {
			this.especie=especie;
		}
		
		public double setpeso () {
			return peso;
		}
		
		public void setpeso(double peso) {
			this.peso=peso;
		}

		public int setpatas() {
			return patas;
		}
		
		public void setpatas(int patas) {
			this.patas=patas;
		}
		
		public void infoAnimal () {
			System.out.println("nome do pet : "+this.setnome());
			System.out.println("especie do pet : "+this.getespecie());
			System.out.println("peso do pet : "+this.setpeso());
			System.out.println("quantidades de patas do pet : "+this.setpatas());
		}
	}


package revisao;

public class funcionario_principal {
	
	public static void main(String[] args) {
	 
		funcionario fun1 = new funcionario(); 
		
		fun1.setCPF("111.222.333-92");
		fun1.getsalario(6, "REAL");
		fun1.setnome("Luiz Vinicius", true, "N");
		fun1.imprimir();
	}
}

package revisao;

public class funcionario {

	String nome;
	double salarioBruto, imposto;
	
		void calculoComissao() {
			double salarioLiquido;
			double calculoComissao;
			salarioLiquido = salarioBruto / 12;
			System.out.println("seu salario liquido � "+ salarioLiquido);
			calculoComissao = salarioBruto - imposto;
			System.out.println("sua comissao � "+ calculoComissao);
		}
		

}

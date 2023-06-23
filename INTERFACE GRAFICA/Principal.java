package Telas;

import javax.swing.JFrame;

public class principal {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				
		ScreenForms1  Login= new ScreenForms1();

		ScreenForms2  CadastroFornecedor = new ScreenForms2();
		
		ScreenForms3  CadastroProduto = new ScreenForms3();
		
		ScreenForms4  CadastroCliente = new ScreenForms4();
				
		
		

		
	}

}

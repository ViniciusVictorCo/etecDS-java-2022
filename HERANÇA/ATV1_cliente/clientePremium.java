package revisao;

public class clientePremium extends cliente{
	@Override
	public double calculaDesconto() {
		return 0.15 * super.getValorPedido();
	}
}

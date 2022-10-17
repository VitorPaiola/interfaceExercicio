package servicos;

public class paypalServico implements ServicoPagamentoOnline {

	@Override
	public double pagamentoTaxa(double quantia) {
		return quantia * 0.02;
	}

	@Override
	public double juros(double quantia, int meses) {
		return quantia * 0.01 * meses;
	}

	
}

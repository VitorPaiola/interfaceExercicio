package servicos;

public interface ServicoPagamentoOnline {

	double pagamentoTaxa(double quantia);
	double juros(double quantia, int meses);
}

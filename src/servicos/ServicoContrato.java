package servicos;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcela;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void contratoProcesso(Contrato contrato, int meses) {
		
		double cotaBasica = contrato.getValorTotal() / meses;
		
		for (int i = 1; i <= meses; i++) {
			LocalDate vencimentoParcela = contrato.getData().plusMonths(i);
			
			double juro = servicoPagamentoOnline.juros(cotaBasica, i); 
			double taxa = servicoPagamentoOnline.pagamentoTaxa(cotaBasica + juro);
			double cota = cotaBasica + juro + taxa;
			
			contrato.getParcelas().add(new Parcela(vencimentoParcela, cota));
		}
	}
}

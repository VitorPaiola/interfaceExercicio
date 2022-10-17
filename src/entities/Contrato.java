package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	
	private List<Parcela> parcelas = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer numero, LocalDate data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
}

/*NÃO SE FAZ O CONSTRUTOR DE UMA LISTA NO CASO 'PARCELA'
 * AO INICIAR UM CONTRATO NÃO EXISTE PARCELA AINDA
 * 
 * NÃO SE FAZ O SET PARA LISTA NO CASO 'PARCELA'
 * PORQUE NÃO PODE TROCAR A LISTA
 * VOCÊ SÓ INSERE E REMOVE ELEMENTOS DA LISTA*/

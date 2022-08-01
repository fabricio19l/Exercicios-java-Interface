package model;

public class Fatura {

	private double pagamento;
	private double taxa;
	
	public Fatura() {
		
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public Fatura(double pagamento, double taxa) {
		super();
		this.pagamento = pagamento;
		this.taxa = taxa;
	}
	
	public double getPagamentoTotal() {
		return getPagamento()+getTaxa();
	}
}

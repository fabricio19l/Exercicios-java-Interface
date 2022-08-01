package Model;

public class Pedido {

	private Cliente cliente;
	private Pizza pizza;
	private int quantidade;
	
	public Pedido(Cliente cliente,  Pizza pizza , int quantidade) {
		this.cliente = cliente;
		this.pizza = pizza;
		this.quantidade = quantidade;
		
	}
	
	public String getValues() {
		return new StringBuilder().append("'").append(this.cliente).append("','").append(this.pizza).append("','").append(this.quantidade).append(" ' ").toString();
		
	}
}

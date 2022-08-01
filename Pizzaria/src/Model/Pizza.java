package Model;

public class Pizza {

	private String nome;
	private double preco;
	private double tempoPreparo;  //em segundos
	
	public Pizza (String nome, double preco, double tempoPreparo) {
		this.nome = nome;
		this.preco = preco;
		this.tempoPreparo = tempoPreparo;
	}
	
	public Pizza(String nome) {
		this.nome = nome;
		
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(double tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}
	
	public String  informacoes() {
		return "SABOR" + nome + "R$" + preco + "\nTEMPO DE PREPARO" + (tempoPreparo / 60) + "minutos";
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tempo de preparo: ").append(this.tempoPreparo).append("\n");
		sb.append("Preço: R$").append(this.preco);
		return sb.toString();
	}
	
	
	
	
	
}

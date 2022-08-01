package Model;

public class  ChefeListen extends Pizza {


	private int opcao;
	
	public ChefeListen(String nome, double preco, double tempoPreparo, int opcao) {
		super(nome, preco, tempoPreparo);
		this.opcao = opcao;
		
	}
}

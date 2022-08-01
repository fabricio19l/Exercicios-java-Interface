package Model;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		
		System.out.println("PIZZARIA---");
		System.out.println("----1 - CADASTRAR CLIENTE");
		System.out.println("----2 - CADASTRAR PEDIDO");
		System.out.println("----3 - CADASTRAR PIZZA");
		System.out.println("----4 - SAIR");
		op = sc.nextInt();
		
		if (op == 1) {
			cadastrarCliente();
		}else if (op == 2) {
			cadastrarPedido();
		}else if (op == 3) {
			cadastrarPizza();
		}else if (op == 4) {
			System.out.println("Encerrando...");
		}else {
			System.out.println("opcção incorreta");
		}
	}}
		private static void cadastrarPizza()throws IOException {
			Scanner sc = new Scanner(System.in);
			String nomePizza ;
			double valor;
			double tempoPreparo;
			System.out.println("sabor: ");
			nomePizza = sc.next();
			System.out.println("valor R$ ");
			valor = sc.nextDouble();
			System.out.println("Tempo de preparo: ");
			tempoPreparo = sc.nextDouble();
			
			Pizza pizza = new Pizza(nomePizza, valor, tempoPreparo);
			System.out.println("Pizza cadastrada com sucesso");
		}
		
		public static void cadastrarCliente() throws IOException {
			Scanner sc = new Scanner(System.in);
			
			
			String nome;
			String  telefone;
			String endereco;
			
			System.out.println("Nome ");
			nome = sc.next();
			System.out.println("Telefone: ");
			telefone = sc.next();
			System.out.println("Endereço: ");
			endereco = sc.next();
			
			Cliente cliente = new Cliente(nome, telefone, endereco);
			System.out.println("Clinte cadastrado com sucesso");
			
			
		}
	public static void cadastrarPedido() throws IOException{
		
		Scanner sc =  new Scanner(System.in);
		
		int quantidade;
		
		System.out.println("quantidade: ");
		sc.next();
		
		Pedido  pedido = new Pedido (null, null, quantidade);
		System.out.println("Pedidio efetuado com sucesso");

}
}
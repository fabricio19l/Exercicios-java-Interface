package model;

import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		
		String nome, autor;
		double preco;
		int faixas, minutos,op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("--- CADASTRO DOS PRODUTOS --- "+"--- 1 CD"+"---2 DVD"+"---3 Livros"+"---4 finalizar"));
			
		if (op == 1) {
			
			nome = JOptionPane.showInputDialog("Nome do CD: ");
			preco = Double.parseDouble("Pre�o do CD: ");
			faixas = Integer.parseInt("Faixas do CD:");
			
			CD cd = new CD(nome, preco, faixas);
			
		}else if (op == 2){
			
			nome = JOptionPane.showInputDialog("Nome do filmw: ");
			preco = Double.parseDouble(JOptionPane.showInputDialog("Pre�o do filme: "));
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos do filme:m "));
			
			DVD dvd = new DVD(nome, preco, minutos);
			dvd.Imprime();
			
		}else if (op == 3){
			
			nome  = JOptionPane.showInputDialog("Nome do livro: ");
			autor  = JOptionPane.showInputDialog("Nome do autor:  ");
			preco = Double.parseDouble(JOptionPane.showInputDialog("pre�o do livro: "));
		
			Livro livro = new Livro(nome, preco, autor);
			livro.Imprime();
			
		}else if (op == 4){
			
			JOptionPane.showMessageDialog(null," encerrando...");
			break;
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Op��o invalida");
		}
		}

		
	}

}

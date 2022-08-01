package cinema;

import javax.swing.JOptionPane;

public class Normal extends Ingresso{

	public Normal() {
		
	}
	public Normal(double valor) {
		super(valor);
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null ,"Ingresso normal /n" + "Valor: R$"+this.getValor());
	}
}

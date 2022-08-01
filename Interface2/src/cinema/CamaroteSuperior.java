package cinema;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{

	public CamaroteSuperior() {
		
			
		
	}

	public CamaroteSuperior(double valor) {
		super(valor);
		
	}
	
	public double valorCS() {
		return getValor() * 1.6;
	}
	
	public void IMpime() {
		JOptionPane.showMessageDialog(null, " Ingresso no ca,arote superior: \n " + "Valor: R$ "+ valorCS());
	}
}

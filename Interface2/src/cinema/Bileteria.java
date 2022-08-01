package cinema;

import javax.swing.JOptionPane;

public class Bileteria {

	public static void main(String[] args) {
		
		double valor;
		int op;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor padão do ingresso: "));
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual ingresso deseja? \n " + "1 - Normal" + "2---VIP" + "3 - camaroteInferior" + "4 - camarote superior" + "5 - finalizar"));
			
		if (op == 1) {
			
			Normal normal = new Normal(valor);
			normal.Imprime();
			
		}else if (op == 2) {
			
			VIP vip = new VIP(valor);
			vip.Imprime();
			
		}else if (op == 3) {
			
			CamaroteInferior ci = new CamaroteInferior(valor);
			ci.Imprime();
			
		}else if (op == 4) {
			
			CamaroteSuperior cs = new CamaroteSuperior(valor);
			cs.Imprime();
		
		}else if (op == 5) {
			
			JOptionPane.showMessageDialog(null, "Finalizando...");
			break;
		}else {
			JOptionPane.showMessageDialog(null, "opção invalida");
			
		}
		
		
		
		
		
		}
					
		
		
		
		

	}

	
	
	
	
}

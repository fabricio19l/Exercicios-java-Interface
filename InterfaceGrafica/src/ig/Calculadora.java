package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(23, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 191, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(119, 31, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(119, 71, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(119, 191, 152, 45);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 + num2;
				
				tfResultado.setText(""+resultado);
				
			}
		});
		btnNewButton.setBounds(233, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Subitra\u00E7\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 - num2;
				tfResultado.setText(""+resultado);
			}
		});
		btnNewButton_1.setBounds(332, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Mutiplica\u00E7\u00E3o");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 * num2;
				tfResultado.setText(""+resultado);
			}
		});
		btnNewButton_2.setBounds(278, 133, 104, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("divis\u00E3o");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				if (num2 >= 0) {
					tfResultado.setText("Não é posivel a divisão");
				}else {
					double resultado = num1 / num2;
					tfResultado.setText(""+resultado);
					
				}
			}
		});
		btnNewButton_3.setBounds(288, 167, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}

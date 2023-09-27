package Lista11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Exe1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtValorFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe1 frame = new Exe1();
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
	public Exe1() {
		setTitle("Cálculo do preço final");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entre com o valor da venda:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 215, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEscolhaAForma = new JLabel("Escolha a forma de pagto:");
		lblEscolhaAForma.setFont(new Font("Arial", Font.BOLD, 14));
		lblEscolhaAForma.setBounds(10, 36, 215, 14);
		contentPane.add(lblEscolhaAForma);
		
		JLabel lblPreoFinalA = new JLabel("Preço final a pagar:");
		lblPreoFinalA.setFont(new Font("Arial", Font.BOLD, 14));
		lblPreoFinalA.setBounds(10, 61, 215, 14);
		contentPane.add(lblPreoFinalA);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Arial", Font.PLAIN, 14));
		txtValor.setBounds(235, 8, 176, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JComboBox cmbPagto = new JComboBox();
		cmbPagto.setModel(new DefaultComboBoxModel(new String[] {"", "Dinheiro", "Cheque", "Cartão"}));
		cmbPagto.setFont(new Font("Arial", Font.PLAIN, 14));
		cmbPagto.setBounds(235, 32, 176, 22);
		contentPane.add(cmbPagto);
		
		txtValorFinal = new JTextField();
		txtValorFinal.setEnabled(false);
		txtValorFinal.setFont(new Font("Arial", Font.PLAIN, 14));
		txtValorFinal.setColumns(10);
		txtValorFinal.setBounds(235, 58, 176, 20);
		contentPane.add(txtValorFinal);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
		btnCalcular.setBounds(10, 94, 196, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultado = Double.parseDouble(txtValor.getText());
				if(cmbPagto.getSelectedIndex()==1) {
					resultado *= 0.95;
				}else if(cmbPagto.getSelectedIndex()==2) {
					resultado *= 1.05;
				}else if(cmbPagto.getSelectedIndex()==3) {
					resultado *= 1.1;
				}
				txtValorFinal.setText(String.valueOf(resultado));
			}
		});
		
		JButton btnLimpa = new JButton("Limpar");
		btnLimpa.setFont(new Font("Arial", Font.BOLD, 14));
		btnLimpa.setBounds(215, 94, 196, 23);
		contentPane.add(btnLimpa);
		btnLimpa.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(null);
				txtValorFinal.setText(null);
				cmbPagto.setSelectedIndex(0);
			}
		});
	}

}

package licao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class sorveteria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFrutasQtde;
	private JTextField txtFrutaUnidade;
	private JTextField txtChocoQtde;
	private JTextField txtTotal;
	private JTextField txtChocoUnidade;
	private JTextField txtBolaQtde;
	private JTextField txtBolaUnidade;
	private JTextField txtPoteQtde;
	private JTextField txtPoteUnidade;
	private JLabel lblNewLabel;
	private JLabel lblChocolatefrutas;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnCalcular;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sorveteria frame = new sorveteria();
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
	public sorveteria() {
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFrutasQtde = new JTextField();
		txtFrutasQtde.setText("0");
		txtFrutasQtde.setBounds(123, 54, 86, 20);
		contentPane.add(txtFrutasQtde);
		txtFrutasQtde.setColumns(10);
		
		txtFrutaUnidade = new JTextField();
		txtFrutaUnidade.setText("0");
		txtFrutaUnidade.setColumns(10);
		txtFrutaUnidade.setBounds(250, 54, 86, 20);
		contentPane.add(txtFrutaUnidade);
		
		txtChocoQtde = new JTextField();
		txtChocoQtde.setText("0");
		txtChocoQtde.setColumns(10);
		txtChocoQtde.setBounds(123, 103, 86, 20);
		contentPane.add(txtChocoQtde);
		
		txtTotal = new JTextField();
		txtTotal.setEnabled(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(250, 244, 86, 20);
		contentPane.add(txtTotal);
		
		txtChocoUnidade = new JTextField();
		txtChocoUnidade.setText("0");
		txtChocoUnidade.setColumns(10);
		txtChocoUnidade.setBounds(250, 103, 86, 20);
		contentPane.add(txtChocoUnidade);
		
		txtBolaQtde = new JTextField();
		txtBolaQtde.setText("0");
		txtBolaQtde.setColumns(10);
		txtBolaQtde.setBounds(123, 153, 86, 20);
		contentPane.add(txtBolaQtde);
		
		txtBolaUnidade = new JTextField();
		txtBolaUnidade.setText("0");
		txtBolaUnidade.setColumns(10);
		txtBolaUnidade.setBounds(250, 153, 86, 20);
		contentPane.add(txtBolaUnidade);
		
		txtPoteQtde = new JTextField();
		txtPoteQtde.setText("0");
		txtPoteQtde.setColumns(10);
		txtPoteQtde.setBounds(123, 197, 86, 20);
		contentPane.add(txtPoteQtde);
		
		txtPoteUnidade = new JTextField();
		txtPoteUnidade.setText("0");
		txtPoteUnidade.setColumns(10);
		txtPoteUnidade.setBounds(250, 197, 86, 20);
		contentPane.add(txtPoteUnidade);
		
		lblNewLabel = new JLabel("Sorvete de frutas:");
		lblNewLabel.setBounds(10, 57, 103, 14);
		contentPane.add(lblNewLabel);
		
		lblChocolatefrutas = new JLabel("Chocolate/frutas:");
		lblChocolatefrutas.setBounds(10, 106, 86, 14);
		contentPane.add(lblChocolatefrutas);
		
		lblNewLabel_2 = new JLabel("Bola:");
		lblNewLabel_2.setBounds(10, 156, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Pote de 2 litros:");
		lblNewLabel_3.setBounds(10, 200, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Total:");
		lblNewLabel_4.setBounds(161, 247, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Qtde");
		lblNewLabel_5.setBounds(137, 29, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Preço Unitário");
		lblNewLabel_6.setBounds(255, 29, 69, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Tipos de Sorvete");
		lblNewLabel_7.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(148, 295, 89, 23);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(247, 295, 89, 23);
		contentPane.add(btnLimpar);
	}

}

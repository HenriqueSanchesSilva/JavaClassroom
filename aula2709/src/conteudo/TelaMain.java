package conteudo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMain frame = new TelaMain();
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
	public TelaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do aluno:");
		lblNewLabel.setFont(new Font("Dubai Medium", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 110, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(126, 9, 134, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPerodo = new JLabel("Período:");
		lblPerodo.setFont(new Font("Dubai Medium", Font.PLAIN, 16));
		lblPerodo.setBounds(10, 46, 69, 14);
		contentPane.add(lblPerodo);
		
		JComboBox cmbPeriodo = new JComboBox();
		cmbPeriodo.setModel(new DefaultComboBoxModel(new String[] {"", "Manhã", "Tarde", "Noite"}));
		cmbPeriodo.setBounds(89, 43, 167, 22);
		contentPane.add(cmbPeriodo);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setFont(new Font("Dubai Medium", Font.PLAIN, 15));
		txtResultado.setBounds(10, 112, 250, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnCalcular = new JButton("Resultado");
		btnCalcular.setBounds(89, 143, 89, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultado = txtNome.getText() + cmbPeriodo.getSelectedItem();
				txtResultado.setText(resultado);
			}
		});
	}
}

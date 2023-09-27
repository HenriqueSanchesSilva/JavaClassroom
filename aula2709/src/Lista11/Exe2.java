package Lista11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class Exe2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe2 frame = new Exe2();
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
	public Exe2() {
		setTitle("Cadastramento de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(10, 39, 57, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 64, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblEstadoCmi = new JLabel("Estado CMI:");
		lblEstadoCmi.setBounds(10, 89, 70, 14);
		contentPane.add(lblEstadoCmi);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Ex: Henrique");
		txtNome.setBounds(257, 11, 161, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setToolTipText("Ex: Rua Maria");
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(257, 36, 161, 20);
		contentPane.add(txtEndereco);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Feminino"}));
		cmbSexo.setBounds(257, 60, 161, 22);
		contentPane.add(cmbSexo);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"", "Casado(a)", "Solteiro(a)", "Viuvo(a)", "União Estável"}));
		cmbEstado.setBounds(257, 85, 161, 22);
		contentPane.add(cmbEstado);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setBounds(10, 152, 414, 86);
		contentPane.add(txtArea);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(10, 118, 204, 23);
		contentPane.add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String textString = "Nome: "+txtNome.getText()+"\nEndereço: "
			+ txtEndereco.getText() +"\nSexo: " +cmbSexo.getSelectedItem()
			+"\nE.C: "+cmbEstado.getSelectedItem();
				
				txtArea.setText(textString);
			}
		});
		
		JButton btnLimpa = new JButton("Limpar");
		btnLimpa.setBounds(220, 118, 204, 23);
		contentPane.add(btnLimpa);
		btnLimpa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtEndereco.setText(null);
				txtArea.setText(null);
				cmbEstado.setSelectedIndex(0);
				cmbSexo.setSelectedIndex(0);
			}
		});
		
	}
}

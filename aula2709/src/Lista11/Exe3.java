package Lista11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Exe3 extends JFrame {

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
					Exe3 frame = new Exe3();
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
	public Exe3() {
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
		txtFrutasQtde.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtFrutasQtde.getText().trim().equals("")) {
					txtFrutasQtde.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtFrutasQtde.setText(null);
			}
		});
		
		txtFrutaUnidade = new JTextField();
		txtFrutaUnidade.setText("0");
		txtFrutaUnidade.setColumns(10);
		txtFrutaUnidade.setBounds(250, 54, 86, 20);
		contentPane.add(txtFrutaUnidade);
		txtFrutaUnidade.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtFrutaUnidade.getText().trim().equals("")) {
					txtFrutaUnidade.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtFrutaUnidade.setText(null);
			}
		});
		
		txtChocoQtde = new JTextField();
		txtChocoQtde.setText("0");
		txtChocoQtde.setColumns(10);
		txtChocoQtde.setBounds(123, 103, 86, 20);
		contentPane.add(txtChocoQtde);
		txtChocoQtde.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtChocoQtde.getText().trim().equals("")) {
					txtChocoQtde.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtChocoQtde.setText(null);
			}
		});
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(250, 244, 86, 20);
		contentPane.add(txtTotal);
		
		txtChocoUnidade = new JTextField();
		txtChocoUnidade.setText("0");
		txtChocoUnidade.setColumns(10);
		txtChocoUnidade.setBounds(250, 103, 86, 20);
		contentPane.add(txtChocoUnidade);
		txtChocoUnidade.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtChocoUnidade.getText().trim().equals("")) {
					txtChocoUnidade.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtChocoUnidade.setText(null);
			}
		});
		
		txtBolaQtde = new JTextField();
		txtBolaQtde.setText("0");
		txtBolaQtde.setColumns(10);
		txtBolaQtde.setBounds(123, 153, 86, 20);
		contentPane.add(txtBolaQtde);
		txtBolaQtde.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtBolaQtde.getText().trim().equals("")) {
					txtBolaQtde.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtBolaQtde.setText(null);
			}
		});
		
		txtBolaUnidade = new JTextField();
		txtBolaUnidade.setText("0");
		txtBolaUnidade.setColumns(10);
		txtBolaUnidade.setBounds(250, 153, 86, 20);
		contentPane.add(txtBolaUnidade);
		txtBolaUnidade.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtBolaUnidade.getText().trim().equals("")) {
					txtBolaUnidade.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtBolaUnidade.setText(null);
			}
		});
		
		txtPoteQtde = new JTextField();
		txtPoteQtde.setText("0");
		txtPoteQtde.setColumns(10);
		txtPoteQtde.setBounds(123, 197, 86, 20);
		contentPane.add(txtPoteQtde);
		txtPoteQtde.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPoteQtde.getText().trim().equals("")) {
					txtPoteQtde.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtPoteQtde.setText(null);
			}
		});
		
		txtPoteUnidade = new JTextField();
		txtPoteUnidade.setText("0");
		txtPoteUnidade.setColumns(10);
		txtPoteUnidade.setBounds(250, 197, 86, 20);
		contentPane.add(txtPoteUnidade);
		txtPoteUnidade.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPoteUnidade.getText().trim().equals("")) {
					txtPoteUnidade.setText("0");
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtPoteUnidade.setText(null);
			}
		});
		
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
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double valorTotal=0;
				if(txtFrutasQtde.getText()!="0") {
					valorTotal += (Double.parseDouble(txtFrutasQtde.getText())*Double.parseDouble(txtFrutaUnidade.getText()));
				}
				if(txtChocoQtde.getText()!="0") {
					valorTotal += (Double.parseDouble(txtChocoQtde.getText())*Double.parseDouble(txtChocoUnidade.getText()));
				}
				if(txtBolaQtde.getText()!="0") {
					valorTotal += (Double.parseDouble(txtBolaQtde.getText())*Double.parseDouble(txtBolaUnidade.getText()));
				}
				if(txtPoteQtde.getText()!="0") {
					valorTotal += (Double.parseDouble(txtPoteQtde.getText())*Double.parseDouble(txtPoteUnidade.getText()));
				}
				
				txtTotal.setText(String.valueOf(valorTotal));
			}
		});
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(247, 295, 89, 23);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtBolaQtde.setText("0");
				txtChocoQtde.setText("0");
				txtFrutasQtde.setText("0");
				txtPoteQtde.setText("0");
				txtBolaUnidade.setText("0");
				txtChocoUnidade.setText("0");
				txtFrutaUnidade.setText("0");
				txtPoteUnidade.setText("0");
				txtTotal.setText(null);
			}
		});
	}

}
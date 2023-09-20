package conteudo;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener{

	private JTextField txtNome;
	private JLabel lblNome;
	private JButton btnSair,btnMostrar;

	public Tela() {
		txtNome = new JTextField(20);
		txtNome.setFont(new Font("Serif",Font.BOLD,40));
		lblNome = new JLabel("Nome do Cliente");
		lblNome.setFont(new Font("Serif",Font.BOLD,40));
		btnSair = new JButton("Sair");
		btnMostrar = new JButton("Mostrar");
		btnSair.addActionListener(this);
		setTitle("Minha Primeira Janela");
		setLocation(0,0);
		setSize(500,400);
		setResizable(true);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new GridLayout(4,1));
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		getContentPane().add(btnSair);
		getContentPane().add(btnMostrar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSair) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);
	}
	
}

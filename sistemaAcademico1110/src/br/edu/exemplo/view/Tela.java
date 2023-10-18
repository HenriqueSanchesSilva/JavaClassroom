package br.edu.exemplo.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.exemplo.dao.AlunoDAO;
import br.edu.exemplo.model.Aluno;

import javax.swing.JComboBox;
import java.awt.TextArea;
import javax.swing.DefaultComboBoxModel;


public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtRa;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtEmail;
	private JComboBox cmbPeriodo;
	private JLabel lblDataDeNascimento;
	private JLabel lblEndereo;
	private JTextField txtEndereco;
	private TextArea txtListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setTitle("Sistema Acadêmico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRa = new JLabel("RA:");
		lblRa.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblRa.setBounds(18, 24, 82, 46);
		contentPane.add(lblRa);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNome.setBounds(287, 24, 82, 46);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEmail.setBounds(287, 81, 82, 46);
		contentPane.add(lblEmail);
		
		JLabel lblPeriodo = new JLabel("Período:");
		lblPeriodo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPeriodo.setBounds(18, 73, 135, 46);
		contentPane.add(lblPeriodo);
		
		txtRa = new JTextField();
		txtRa.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtRa.setBounds(105, 26, 167, 37);
		contentPane.add(txtRa);
		txtRa.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtNome.setColumns(10);
		txtNome.setBounds(348, 26, 477, 37);
		contentPane.add(txtNome);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(163, 140, 167, 37);
		contentPane.add(txtDataNasc);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtEmail.setColumns(10);
		txtEmail.setBounds(348, 81, 477, 37);
		contentPane.add(txtEmail);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRa.setText(null);
				txtNome.setText(null);
				txtEmail.setText(null);
				txtDataNasc.setText(null);
				txtListar.setText(null);
				txtEndereco.setText(null);
				cmbPeriodo.setSelectedIndex(0);
			}
		});
		btnNovo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNovo.setBounds(29, 405, 124, 61);
		contentPane.add(btnNovo);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				aluno.setRa(Integer.parseInt(txtRa.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setDataNascimento(txtDataNasc.getText());
				aluno.setPeriodo(String.valueOf(cmbPeriodo.getSelectedItem()));
				try {
					AlunoDAO alunoDAO = new AlunoDAO();
					alunoDAO.salvar(aluno);
				} catch (Exception er) {
					JOptionPane.showMessageDialog(null, er.getMessage());
					
				}
				
			}
		});
		btnSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSalvar.setBounds(173, 405, 99, 61);
		contentPane.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Aluno aluno = new Aluno();
					aluno.setRa(Integer.parseInt(txtRa.getText()));
					aluno.setNome(txtNome.getText());
					aluno.setEmail(txtEmail.getText());
					aluno.setEndereco(txtEndereco.getText());
					aluno.setDataNascimento(txtDataNasc.getText());
					aluno.setPeriodo(String.valueOf(cmbPeriodo.getSelectedItem()));
					AlunoDAO alunoDAO = new AlunoDAO();
					alunoDAO.atualizar(aluno);
				} catch (Exception er) {
					JOptionPane.showMessageDialog(null, er.getMessage());
					
				}
			}
		});
		btnAlterar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnAlterar.setBounds(287, 405, 113, 61);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnExcluir.setBounds(425, 405, 106, 61);
		contentPane.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int ra = Integer.parseInt(txtRa.getText());
					AlunoDAO dao = new AlunoDAO();
					Aluno aluno = dao.consultar(ra);
					txtNome.setText(aluno.getNome());
					txtEmail.setText(aluno.getEmail());
					txtEndereco.setText(aluno.getEndereco());
					txtDataNasc.setText(aluno.getDataNascimento());
					txtRa.setText(String.valueOf(ra));
					cmbPeriodo.setSelectedItem(aluno.getPeriodo());
				}
				catch (Exception er) {
					JOptionPane.showMessageDialog(null, er.getMessage());
				}
			}
		});
		btnConsultar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnConsultar.setBounds(559, 405, 124, 61);
		contentPane.add(btnConsultar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnListar.setBounds(708, 405, 124, 61);
		contentPane.add(btnListar);
		
		cmbPeriodo = new JComboBox();
		cmbPeriodo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cmbPeriodo.setModel(new DefaultComboBoxModel(new String[] {"Selecione um periodo", "Manhã", "Tarde", "Noite"}));
		cmbPeriodo.setBounds(105, 79, 167, 37);
		contentPane.add(cmbPeriodo);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDataDeNascimento.setBounds(18, 138, 135, 46);
		contentPane.add(lblDataDeNascimento);
		
		lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEndereo.setBounds(348, 138, 135, 46);
		contentPane.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(445, 140, 380, 37);
		contentPane.add(txtEndereco);
		
		txtListar = new TextArea();
		txtListar.setEnabled(false);
		txtListar.setBounds(18, 190, 821, 195);
		contentPane.add(txtListar);
	}
}

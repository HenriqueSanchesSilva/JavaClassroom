package br.edu.exemplo.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.exemplo.dao.AlunoDAO;
import br.edu.exemplo.model.Aluno;

import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.TextArea;

public class TelaSistemaAcademico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSistemaAcademico frame = new TelaSistemaAcademico();
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
	public TelaSistemaAcademico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("RA");
		label.setFont(new Font("Dialog", Font.PLAIN, 18));
		label.setBounds(21, 10, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Nome");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(21, 70, 62, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Email");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(21, 130, 62, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Data Nascimento");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_3.setBounds(21, 190, 173, 22);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Endereço");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setBounds(21, 250, 116, 22);
		contentPane.add(label_4);
		
		Label label_5 = new Label("Periodo");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_5.setBounds(23, 310, 103, 22);
		contentPane.add(label_5);
		
		TextField txtRa = new TextField();
		txtRa.setBounds(208, 10, 347, 22);
		contentPane.add(txtRa);
		
		TextField txtNome = new TextField();
		txtNome.setBounds(208, 70, 347, 22);
		contentPane.add(txtNome);
		
		TextField txtEmail = new TextField();
		txtEmail.setBounds(208, 130, 347, 22);
		contentPane.add(txtEmail);
		
		TextField txtDataNascimento = new TextField();
		txtDataNascimento.setBounds(208, 190, 347, 22);
		contentPane.add(txtDataNascimento);
		
		TextField txtEndereco = new TextField();
		txtEndereco.setBounds(208, 250, 347, 22);
		contentPane.add(txtEndereco);
		
		JComboBox cbxPeriodo = new JComboBox();
		cbxPeriodo.setBounds(208, 310, 347, 22);
		contentPane.add(cbxPeriodo);
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtRa.setText(null);
				txtNome.setText(null);
				txtEmail.setText(null);
				txtDataNascimento.setText(null);
				txtEndereco.setText(null);
				cbxPeriodo.setSelectedIndex(0);
				
			}
		});
		btnNovo.setBounds(21, 461, 89, 40);
		contentPane.add(btnNovo);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Aluno aluno = new Aluno();
			aluno.setRa(Integer.parseInt(txtRa.getText()));
			aluno.setNome(txtNome.getText());
			aluno.setEmail(txtEmail.getText());
			aluno.setDataNascimento(txtDataNascimento.getText());
			aluno.setEndereco(txtEndereco.getText());
			aluno.setPeriodo((String)cbxPeriodo.getSelectedItem());
			
				try {
					AlunoDAO dao = new AlunoDAO();
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				}catch(Exception el) {
					JOptionPane.showMessageDialog(null, el.getMessage());
				};
			
			}
			
		});
		btnSalvar.setBounds(120, 461, 89, 40);
		contentPane.add(btnSalvar);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//???????????????
			}
		});
		btnAtualizar.setBounds(219, 461, 89, 40);
		contentPane.add(btnAtualizar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(318, 461, 89, 40);
		contentPane.add(btnExcluir);
		
		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int ra = Integer.parseInt(txtRa.getText());
					AlunoDAO dao = new AlunoDAO();
					Aluno aluno = dao.consultar(ra);
					txtNome.setText(aluno.getNome());
				} catch (Exception el) {
					JOptionPane.showMessageDialog(null, el.getMessage());
				}
			}
		});
		btnConsultar.setBounds(417, 461, 103, 40);
		contentPane.add(btnConsultar);
		
		TextArea txtLista = new TextArea();
		txtLista.setBounds(208, 340, 396, 115);
		contentPane.add(txtLista);
		
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Aluno> lista = new ArrayList<Aluno>();
				try {
					AlunoDAO dao = new AlunoDAO();
					lista = dao.listar();
					for(Aluno aluno : lista) {
						txtLista.append("RA....."+aluno.getRa()+
								"\nNome....."+aluno.getNome()+""+
								"\nEmail....."+aluno.getEmail()+""+
								"\nData de Nascimento....."+aluno.getDataNascimento()+""+
								"\nEndereço....."+aluno.getEndereco()+""+
								"\nPeriodo....."+aluno.getPeriodo()+"");
						txtLista.append("=============================");
					}
				} catch (Exception el) {
					
				}
			}
		});
		btnListar.setBounds(530, 461, 89, 40);
		contentPane.add(btnListar);
		
		
		
		
	}
}

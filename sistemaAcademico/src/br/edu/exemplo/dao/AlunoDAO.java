package br.edu.exemplo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.exemplo.model.Aluno;
import br.edu.exemplo.util.ConnectionFactory;
public class AlunoDAO {
	// classes de banco de dados
	private Connection conn;   // abre a conexao do banco de dados
	private PreparedStatement ps;  // permite que scripts SQL sejam executados a partir do Java
	private ResultSet rs;  // representa as tabelas
	// classe JavaBean
	private Aluno aluno;

	public AlunoDAO() throws Exception {
		// chama a classe ConnectionFactory e estabele uma conexao
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	// metodo de salvar

	public void salvar(Aluno aluno) throws Exception {
		if (aluno == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO alunos (ra, nome, email, endereco, datanascimento, periodo) values "
					+ "(?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, aluno.getRa());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setString(4, aluno.getEndereco());
			ps.setString(5, aluno.getDataNascimento());
			ps.setString(6, aluno.getPeriodo());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}
	// Procurar Aluno

		public Aluno consultar(int raAluno) throws Exception {

			try {
				String SQL = "SELECT  * FROM alunos WHERE ra=?";
				ps = conn.prepareStatement(SQL);
				ps.setInt(1, raAluno);			
				rs = ps.executeQuery();
				if (rs.next()) {
					int ra = rs.getInt("ra");
					String nome = rs.getString("nome");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					String dataNascimento = rs.getString("dataNascimento");
					String periodo = rs.getString("periodo");
					
					aluno = new Aluno(ra, nome, email, endereco, dataNascimento, periodo);
				}
				return aluno;
			} catch (SQLException sqle) {
				throw new Exception(sqle);
			} finally {
				ConnectionFactory.closeConnection(conn, ps, rs);
			}
		}		
		
		public void atualizar(Aluno aluno) throws Exception {
			if (aluno == null)
				throw new Exception("O valor passado nao pode ser nulo");
			try {
				String SQL = "UPDATE alunos SET nome + ?, email = ?, endereco = ?, datanascimento = ?, periodo = ? WHERE ra=?";
				ps = conn.prepareStatement(SQL);
				ps.setInt(6, aluno.getRa());
				ps.setString(2, aluno.getNome());
				ps.setString(3, aluno.getEmail());
				ps.setString(4, aluno.getEndereco());
				ps.setString(5, aluno.getDataNascimento());
				ps.setString(6, aluno.getPeriodo());
				ps.executeUpdate();
			} catch (SQLException sqle) {
				throw new Exception("Erro ao inserir dados " + sqle);
			} finally {
				ConnectionFactory.closeConnection(conn, ps);
			}
			
		}
		
		public void excluir(Aluno aluno) throws Exception {
			if (aluno == null)
				throw new Exception("O valor passado nao pode ser nulo");
			try {
				String SQL = "DELETE from alunos WHERE ra=?";
				ps = conn.prepareStatement(SQL);
				ps.setInt(1, aluno.getRa());
				ps.executeUpdate();
			} catch (SQLException sqle) {
				throw new Exception("Erro ao excluir dados " + sqle);
			} finally {
				ConnectionFactory.closeConnection(conn, ps);
			}
			
		}
		public List<Aluno> listar() throws Exception {
			try {
				String SQL = "SELECT  * FROM alunos";
				ps = conn.prepareStatement(SQL);
				rs = ps.executeQuery();
				List<Aluno> lista = new ArrayList<Aluno>();
				while (rs.next()) {
					int ra = rs.getInt(1);
					String nome = rs.getString(2);
					String email = rs.getString(3);
					String dataNascimento = rs.getString(4);
					String endereco = rs.getString(5);
					String periodo = rs.getString(6);
					lista.add(new Aluno(ra, nome, email, endereco, dataNascimento, periodo));
				}
				
				return lista;
			} catch (SQLException sqle) {
				throw new Exception(sqle);
			} finally {
				ConnectionFactory.closeConnection(conn, ps, rs);
			}
			
		}
		

}

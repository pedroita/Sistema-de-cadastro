package cadastrodoaluno;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import conectarcombanco.ConexaoBancoDados;
import fichaaluno.Alunos;
import interfaces.DAO;

public class CadastroAluno implements DAO {

	private Connection connection;
	public CadastroAluno() {
		this.connection = (Connection) new ConexaoBancoDados().getConnection();
	}
	
	
	
	@Override
	public void inserir(Alunos aluno) {
		String sql = "Insert into dadosaluno" + "(nome,endereco,email,turma,turno)" +  "values (?,?,?,?,?)";
		try {
			PreparedStatement stmt = ((Connection) connection).prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			stmt.setString(3, aluno.getEmail());
			stmt.setString(4, aluno.getTurma());
			stmt.setString(5, aluno.getTurno());
			
			
			stmt.execute();
			stmt.close();
			
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar inserir contato"+ e.toString());
		}
		
	}

	@Override
	public List<Alunos> geList() {
		String SQL = "select * from dadosaluno";
		try {
			List<Alunos> dadosalunos = new ArrayList<Alunos>();
			PreparedStatement pstm = connection.prepareStatement(SQL);
			ResultSet rs = pstm.executeQuery();
			//Alunos dadosaluno = new Alunos();
			
			while(rs.next()) {
				Alunos dadosaluno = new Alunos();
				dadosaluno.setId(rs.getLong("id"));
				dadosaluno.setNome(rs.getString("nome"));
				dadosaluno.setEndereco(rs.getString("endereco"));
				dadosaluno.setEmail(rs.getString("email"));
				dadosaluno.setTurma(rs.getString("turma"));
				dadosaluno.setTurno(rs.getString("turno"));
				dadosalunos.add(dadosaluno);
				
			}
			rs.close();
			pstm.close();
			return dadosalunos;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel carregar os dados do banco" + e.toString());
		}
		return null;
	}

	@Override
	public void excluir(Long id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from  dadosaluno where id= ?");
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar excluir"+ e.toString());
			
		}
		
	}
	

	@Override
	public void alterar(Alunos aluno) {
		String sql = "update dadosaluno set nome=?,endereco=?,email=?,turma=?,turno=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEndereco());
			stmt.setString(3, aluno.getEmail());
			stmt.setString(4, aluno.getTurma());
			stmt.setString(5, aluno.getTurno());
			stmt.setLong(6, aluno.getId());
			stmt.execute();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar"+ e.toString());
			
		}
		
	}
		
}



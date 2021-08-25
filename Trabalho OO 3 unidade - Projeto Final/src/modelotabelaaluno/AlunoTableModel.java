package modelotabelaaluno;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.swing.table.AbstractTableModel;


import cadastrodoaluno.CadastroAluno;
import fichaaluno.Alunos;


public class AlunoTableModel extends AbstractTableModel {
	private List<Alunos> listaAlunos;
	private List<String> colunas;
	private CadastroAluno dao;
	
	public AlunoTableModel(CadastroAluno dao) {
		this.dao = dao;
		this.listaAlunos = dao.geList();
		this.colunas = Arrays.asList("Codigo", "nomeAluno","endereco","email", "turma","turno");
	}
	
	
	@Override
	public int getRowCount() {
		
		return listaAlunos.size();
	}
	@Override
	public int getColumnCount() {
		
		return colunas.size();
	}
	
	public String getColumnName(int column) {
        
        return colunas.get(column);
    }
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Alunos aluno = listaAlunos.get(rowIndex);
		switch (columnIndex) {	 
		case 0:
			return aluno.getId();
		case 1:
			return aluno.getNome();
		case 2:
			return aluno.getEndereco();
		case 3:
			return aluno.getEmail();
		case 4:
			return aluno.getTurma();
		case 5:
			return aluno.getTurno();
		}
		
		return null;
	}
	
	public void setValueAt(Object aValue, int linhaIndex, int colunaIndex) {
		Alunos aluno = listaAlunos.get(linhaIndex);
		switch (colunaIndex) {
		case 1:
			aluno.setNome((String)aValue);
			break;
		
		case 2:
			aluno.setEndereco((String)aValue);
			break;
		case 3:
			aluno.setEmail((String)aValue);
			break;
		case 4:
			aluno.setTurma((String)aValue);
			break;
		case 5:
			aluno.setTurno((String)aValue);
			break;
		default:
			throw new IndexOutOfBoundsException("Indice da coluna" + "Fora dos Limites");
		
	    
		}
		dao.alterar(aluno);
		fireTableCellUpdated(colunaIndex, linhaIndex);
	}
	
	public boolean isCellEditable(int linha, int coluna) {
		return true;
	}
	
	
	
}

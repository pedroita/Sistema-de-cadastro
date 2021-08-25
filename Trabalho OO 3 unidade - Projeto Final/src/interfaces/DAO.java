package interfaces;

import java.util.List;

import fichaaluno.Alunos;



public interface DAO {
	public void inserir(Alunos aluno);
	public List<Alunos>geList();
	public void excluir(Long id);
	public void alterar(Alunos aluno);
}

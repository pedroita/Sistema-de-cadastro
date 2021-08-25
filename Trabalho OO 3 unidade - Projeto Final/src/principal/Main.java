package principal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import cadastrodoaluno.CadastroAluno;
import fichaaluno.Alunos;
import interfaces.DAO;
import janelaTabela.JanelaJTable;
import telacadastro.TelaCadastro;

public class Main {

	public static void main(String[] args) {
			/*CadastroAluno  dao = new CadastroAluno();
			
			Alunos aluno = new Alunos();
			
			aluno.setNome("Pedro");
			aluno.setEndereco("Rua nda");
			aluno.setEmail("Pedro italosdada@fdsfdsf");
			aluno.setTurma("Nataçao");
			aluno.setTurno("tarde");
			
			System.out.println("dados" + dao.geList());*/
		new JanelaJTable();
	}

}

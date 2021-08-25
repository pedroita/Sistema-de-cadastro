package fichaaluno;

import java.util.Calendar;

public class Alunos {
	private Long id;
	private String nome;
	private String endereco;
	private String email;
	private Calendar dataNascimento;
	private String turma;
	private String turno;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Alunos [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + ", turma=" + turma + ", turno=" + turno + "]";
	}
	
	
	
}

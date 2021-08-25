package telacadastro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import cadastrodoaluno.CadastroAluno;
import fichaaluno.Alunos;
import janelaTabela.JanelaJTable;


public class TelaCadastro {
	public TelaCadastro () {
		
		TelaRederizado();
	}
	//painel
	private JFrame janela;
	private JPanel jpNomeA;	
	private JPanel jpEndereco;	
	private JPanel jpEmail;	
	private JPanel jpTurma;	
	private JPanel jpTurno;	
	private JPanel jpBotaoes;
	//Rotulos
	private JLabel JlNomeA;	
	private JLabel JlEndereco;
	private JLabel JlEmail;
	private JLabel JlTurma;
	private JLabel JlTurno;
	
	//caixa de texto
	
	private JTextField txtNomeA;
	private JTextField txtEndereco;
	private JTextField txtEmail;	
	private JTextField txtTurma;
	private JTextField txtTurno;
	
	//Atributos botaoes
	private JButton jbtNovo;
	private JButton jbLimpar;
	private JButton jbtSair;
	
	private void criarComponetes() {
	janela = new JFrame("Tela de cadastro");
    jpNomeA = new JPanel();
    jpEndereco = new JPanel();
    jpEmail = new JPanel();
    
    jpTurma = new JPanel();
    jpTurno = new JPanel();
    jpBotaoes = new JPanel();
		  
    JlNomeA = new JLabel("Nome:");	  
    JlEndereco = new JLabel("Endereço:");
    JlEmail = new JLabel("E-mail:");   
    
    JlTurma= new JLabel("Turma:");	  
    JlTurno= new JLabel("Turno:");	  

    txtNomeA  = new JTextField(15);
    txtEmail = new JTextField(15);
    txtEndereco = new JTextField(15);
   
    txtTurma = new JTextField(15);		 	
    txtTurno = new JTextField(15);
		        
    jbtNovo= new JButton("Cadastrar");
    jbLimpar = new JButton("Limpa Campos");
    jbtSair = new JButton("Sair");	        
	}
		
	private void prepararPaineis() {
		 
	 jpNomeA.setLayout(new FlowLayout());
	 jpNomeA.add(JlNomeA);
	 jpNomeA.add(txtNomeA);
	 
	 jpEndereco.setLayout(new FlowLayout());
	 jpEndereco.add(JlEndereco);
	 jpEndereco.add(txtEndereco);
	 
	 jpEmail.setLayout(new FlowLayout());
	 jpEmail.add(JlEmail);
	 jpEmail.add(txtEmail);
	 
		 
	
	 jpTurma.setLayout(new FlowLayout());
	 jpTurma.add(JlTurma);
	 jpTurma.add(txtTurma);
	 
	 jpTurno.setLayout(new FlowLayout());
	 jpTurno.add(JlTurno);
	 jpTurno.add(txtTurno); 
		
	 jpBotaoes.setLayout(new FlowLayout());
	 jpBotaoes.add(jbtNovo);
	 jpBotaoes.add(jbLimpar);
	 jpBotaoes.add(jbtSair);	  
		  
	}	  
	 private void PreparaJanela() {
			janela.setLayout(new FlowLayout());
			janela.add(jpNomeA);
			janela.add(jpEndereco);
			janela.add (jpEmail);
			janela.add(jpTurma);
			janela.add(jpTurno);
			janela.add(jpBotaoes);
			
			janela.add(jpBotaoes);
			janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);
			janela.setLocationRelativeTo(null);
			janela.setSize(340,250);
			janela.setResizable(false);
			janela.setVisible(true);
		}	
		
	 private void botaotSair() {
			jbtSair.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
						janela.dispose();
					}
			});
			
		}
	 
	 private void botaoLimpar() {
		 jbLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			txtNomeA.setText("");
			txtEndereco.setText("");
			txtEmail.setText("");				
			txtTurma.setText("");
			txtTurno.setText("");					
			}
		});
	 }
	
	 
	 public void botaoNovo() {
			jbtNovo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Alunos a = new Alunos();
					a.setNome(txtNomeA.getText());
					a.setEndereco(txtEndereco.getText());
					a.setEmail(txtEmail.getText());
					
				
					a.setTurma(txtTurma.getText());
   				    a.setTurno(txtTurno.getText());
   				    
   				    String nome = (txtNomeA.getText());
   				    String endereco= txtEndereco.getText();
   				    String email = txtEmail.getText();
					
				
   				   String turma= txtTurma.getText();
   				   String turno = txtTurno.getText();
   				   
   				    
   				 JOptionPane.showMessageDialog(null, "Dados Cadastrados: " + 
							"\nNome: " + nome +
							"\nEndereco: " + endereco +
							"\nEmail: " + email + 
							"\nTurma: " + turma +
							"\nTurno: "   + turno 
							);
	   				txtNomeA.setText("");
	   				txtEndereco.setText("");
	   				txtEmail.setText("");				
	   				txtTurma.setText("");
	   				txtTurno.setText("");
					CadastroAluno dao = new CadastroAluno ();
					dao.inserir(a);
					
					
				}
				
				
			});
			
		}
	 
	 
	
	private void TelaRederizado() {

		criarComponetes();
		prepararPaineis();
		PreparaJanela();		
		botaotSair();
		botaoLimpar();
		botaoNovo();
	}
}

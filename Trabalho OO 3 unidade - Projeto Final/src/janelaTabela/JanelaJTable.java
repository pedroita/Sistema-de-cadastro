package janelaTabela;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import cadastrodoaluno.CadastroAluno;
import fichaaluno.Alunos;
import modelotabelaaluno.AlunoTableModel;
import telacadastro.TelaCadastro;





public class JanelaJTable {
	JFrame frame = new JFrame();
	private static CadastroAluno dao = new CadastroAluno();
	private static AlunoTableModel tm = new AlunoTableModel(dao);
	
	private JPanel panelBotoes;
	private static JPanel panelPrincipal;
	private static JScrollPane scroll = new JScrollPane();
	private static JTable tabela;
	private JButton btnovo;
	private JButton btexcluir;
	private JButton btsair;
	private JButton btalterar;
	
	
	
	public static void atualizartabela() {
		dao = new CadastroAluno();
		tm = new AlunoTableModel(dao);
		tabela = new JTable(tm);
		panelPrincipal.add(scroll);
	}
	
	public JanelaJTable() {
		criaComponentes();
		preparaPanel();
		preparaJanela();
		botaoNovo();
		boaoSair() ;
		
		boaoExcluir();
		
	}
	
	
	

	private void criaComponentes() {
		frame = new JFrame("Tela principal - Cadastro Clube da águas");
		panelPrincipal= new JPanel();
		panelBotoes = new JPanel();
		
		scroll = new JScrollPane();
		tabela = new JTable(tm);
		
		btnovo = new JButton("Novo");
		btalterar = new JButton("Alterar");
		btexcluir = new JButton("Excluir");	
		btsair = new JButton("Sair");
		
	}
	
	private void preparaPanel() {
		panelPrincipal.setSize(500,680);
		panelPrincipal.setLayout(new FlowLayout());
		scroll.setViewportView(tabela);
		panelBotoes.add(btnovo);
		
		panelBotoes.add(btexcluir);
		panelBotoes.add(btsair);
		panelPrincipal.add(scroll);
		
		
		
	}
	
	private void preparaJanela() {
		frame.setLayout(new FlowLayout());
		frame.add(panelPrincipal);
		frame.add(panelBotoes);
		frame.setSize(530,560);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	private void botaoNovo() {
		btnovo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro();
				
			}
			
		});
		
	}
	
	private void boaoSair() {
		btsair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	private void boaoExcluir() {
		btexcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelecionada = tabela.getSelectedRow();
				if (linhaSelecionada >=0) {
					long idAluno = (long)  tabela.getValueAt(linhaSelecionada, 0);
					dao.excluir(idAluno);
					atualizartabela();
				}else {
					JOptionPane.showMessageDialog(null, "É necessario selecionar uma linha");
					
				}
			}
		});
	}
	
	

	
}

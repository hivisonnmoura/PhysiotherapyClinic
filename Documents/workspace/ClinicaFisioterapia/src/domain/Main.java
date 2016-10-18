package domain;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Entity.Paciente;
import Services.CadastraPaciente;
import ValueObject.OpcoesMenu;

public class Main {
	
	static CadastraPaciente cadastraPaciente = new CadastraPaciente();
	public static void main(String[] args) {
		criarInterfaceDeMenu();
	}
	
	private static void criarInterfaceDeMenu(){
		
		// Frame
		/*JFrame menuFrame = new JFrame();
		menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		menuFrame.setBounds(50, 100, 800, 500);*/
		
		// Text Pane
		JPanel textoPanel = new JPanel();
		JLabel menuTexto = new JLabel("Menu");
		textoPanel.add(menuTexto);
		
		// Buttons Pane
		JPanel botoesPanel = new JPanel();
		botoesPanel.setLayout(new BoxLayout(botoesPanel, BoxLayout.LINE_AXIS));
		
		
		JButton botaoVoltar = new JButton(OpcoesMenu.VOLTAR);
		JButton botaoCadastrarFuncionario = new JButton(OpcoesMenu.CADASTRAR_NOVO_FUNCIONARIO);
		JButton botaoCriarTerapia = new JButton(OpcoesMenu.CRIAR_NOVA_TERAPIA);		
		
		botoesPanel.add(botaoCadastrarFuncionario);
		botoesPanel.add(botaoCriarTerapia);
		
		Container container = getContentPane();
		//menuFrame.getContentPane().add(botoesPanel);
		//menuFrame.setVisible(true);
		
		JPanel cadastrarFuncionarioPanel = new JPanel();
		
		botaoCadastrarFuncionario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuFrame.getContentPane().removeAll();
				cadastrarFuncionarioPanel.add(botaoVoltar);
				menuFrame.getContentPane().add(cadastrarFuncionarioPanel);
				menuFrame.setVisible(true);
			}
		});
	}
	

}

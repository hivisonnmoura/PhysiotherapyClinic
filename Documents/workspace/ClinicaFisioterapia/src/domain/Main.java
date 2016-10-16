package domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Entity.Paciente;
import Services.CadastraPaciente;
import ValueObject.OpcoesMenu;

public class Main {
	
	static CadastraPaciente cadastraPaciente = new CadastraPaciente();
	public static void main(String[] args) {
			/*List<Paciente> listaDePaciente = cadastraPaciente.fabricarPaciente();
			for (Paciente paciente : listaDePaciente) {
				JOptionPane.showMessageDialog(null, "Você tem uma consulta com " + paciente.getNome()
				+ "\nCPF: " + paciente.getCpf()
				+ " as " + paciente.getHorarioMarcado() + "\n");
			}*/
		
		criarInterfaceDeMenu();
	}
	
	private static void criarInterfaceDeMenu(){
		JFrame menuFrame = new JFrame();
		JPanel menuPanel = new JPanel();
		JPanel cadastrarFuncionarioPanel = new JPanel();
		JButton botaoVoltar = new JButton(OpcoesMenu.VOLTAR);
		JButton botaoCadastrarFuncionario = new JButton(OpcoesMenu.CADASTRAR_NOVO_FUNCIONARIO);
		JButton botaoCriarTerapia = new JButton(OpcoesMenu.CADASTRAR_NOVO_FUNCIONARIO);
		JLabel menuTexto = new JLabel("Menu");
		
		menuFrame.setBounds(50, 100, 800, 500);
		
		menuPanel.add(menuTexto);
		menuPanel.add(botaoCadastrarFuncionario);
		menuFrame.getContentPane().add(menuPanel);
		menuFrame.setVisible(true);
		
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

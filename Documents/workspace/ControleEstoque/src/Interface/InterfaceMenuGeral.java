package Interface;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Repositorios.RepositorioEstoqueProduto;
import Servicos.ServicoProduto;

public class InterfaceMenuGeral {

	public static void interfaceInicial(final RepositorioEstoqueProduto repositorioEstoqueProduto) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton botaoCadastrarProduto = new JButton("Cadastrar Produto");
		JButton botaoCadastrarPedido = new JButton("Cadastrar Pedido");
		JLabel titulo = new JLabel("GEstoque");
		titulo.setHorizontalAlignment(0);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// panel.setLayout(new GridLayout(3, 1));
		panel.add(titulo);

		// botaoCadastrarPedido.setPreferredSize(new Dimension(100, 100));
		panel.add(botaoCadastrarProduto);
		panel.add(botaoCadastrarPedido);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrarProduto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				interfaceCadastroProduto(repositorioEstoqueProduto);
			}
		});

		botaoCadastrarPedido.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				interfaceCadastroPedido();
			}
		});

	}

	private static void interfaceCadastroProduto(final RepositorioEstoqueProduto repositorioEstoqueProduto) {
		final JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel labelCodigo = new JLabel("Codigo");
		JLabel labelTipo = new JLabel("Tipo do produto");
		final JTextField idDoProduto = new JTextField();
		final JTextField nomeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		labelCodigo.setHorizontalAlignment(0);
		panel.add(labelCodigo);
		idDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoProduto);

		labelTipo.setHorizontalAlignment(0);
		panel.add(labelTipo);
		nomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(nomeDoProduto);

		panel.add(botaoCadastrar);
		panel.add(botaoCancelar);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				repositorioEstoqueProduto.insert(
						ServicoProduto.novo().solicitarCriacaoProduto(idDoProduto.getText(), nomeDoProduto.getText()));

				int lastPosition = repositorioEstoqueProduto.findAll().size() - 1;

				repositorioEstoqueProduto.findAll().get(lastPosition);
				System.out.println("Codigo: " + repositorioEstoqueProduto.findAll().get(lastPosition).getCodigo());
				System.out.println("Nome: " + repositorioEstoqueProduto.findAll().get(lastPosition).getNome());

			}
		});
		botaoCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}

		});

	}

	private static void interfaceCadastroPedido() {
		final JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Id do cadastro");
		JLabel labelNome = new JLabel("Nome do produto");
		final JTextField idDoProduto = new JTextField();
		final JTextField nomeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");
		idDoProduto.setText("");
		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		idDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoProduto);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		nomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(nomeDoProduto);

		panel.add(botaoCadastrar);
		panel.add(botaoCancelar);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("id: " + idDoProduto.getText());
				System.out.println("produto: " + nomeDoProduto.getText());
				idDoProduto.setText("");
				nomeDoProduto.setText("");
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});
	}

}

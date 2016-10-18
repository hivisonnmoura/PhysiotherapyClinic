package Servicos;

import Entidades.Produto;
//import Enumeradores.TipoProduto;
import Fabricas.FabricaProduto;
import Repositorios.RepositorioEstoqueProduto;

public class ServicoProduto {

	public static RepositorioEstoqueProduto repositorioEstoqueProduto = new RepositorioEstoqueProduto();

	private ServicoProduto() {
		// TODO Auto-generated constructor stub
	}

	public static ServicoProduto novo() {
		return new ServicoProduto();
	}

	/*
	 * public Produto solicitarCriacaoProduto(String codigo, TipoProduto tipo){
	 * return FabricaProduto.nova().novo(codigo, tipo); }
	 */

	public Produto solicitarCriacaoProduto(String codigo, String nome) {
		return FabricaProduto.nova().novo(codigo, nome);
	}

}
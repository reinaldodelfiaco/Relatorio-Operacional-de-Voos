package br.com.ciacpla.rovdigital.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.ciacpla.rovdigital.entity.State;

public class StateDAOTest {
	@Test
	@Ignore
	public void salvar() {
		State estado = new State();
		estado.setName("Distrito Federal");
		estado.setAcronym("DF");

		StateDAO estadoDAO = new StateDAO();
		estadoDAO.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		StateDAO estadoDAO = new StateDAO();
		List<State> resultado = estadoDAO.listar();

		System.out.println("Encontrados: " + resultado.size());
	}

	@Test
	@Ignore
	public void buscar() {
		long codigo = 1L;
		StateDAO estadoDAO = new StateDAO();
		State estado = estadoDAO.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum registro encontrado.");
		} else {
			System.out.println(estado.getCodigo() + " - " + estado.getName());
		}
	}
	
	@Test
	public void excluir(){
		long codigo = 4L;
		StateDAO estadoDAO = new StateDAO();
		State estado = estadoDAO.buscar(codigo);

		if (estado == null) {
			System.out.println("Nenhum registro excluido.");
		} else {
			estadoDAO.excluir(estado);
			System.out.println("Registro excluido:");
			System.out.println(estado.getCodigo() + " - " + estado.getName());
		}
	}
}

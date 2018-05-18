package service.impl;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import model.Tarefa;
import repository.RepositoryTarefa;
import service.ServiceTarefa;

@Dependent
public class ServiceTarefaImpl implements ServiceTarefa {

	// Implementação da Interface responsavel por delegar uma chamada ao repository e tratar erros
	@Inject
	private RepositoryTarefa repositoryTarefa;

	@Override
	public void incluir(Tarefa tarefa) {
		try {
			this.repositoryTarefa.incluir(tarefa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Tarefa alterar(Tarefa tarefa) {
		try {
			this.repositoryTarefa.alterar(tarefa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Tarefa buscarPorId(Long id) {
		try {
			return repositoryTarefa.buscarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Tarefa> buscarTodos() {
		try {
			return repositoryTarefa.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

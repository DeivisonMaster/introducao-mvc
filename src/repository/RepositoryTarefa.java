package repository;

import java.util.List;

import model.Tarefa;

public interface RepositoryTarefa {
	
	void incluir(Tarefa tarefa);
	
	Tarefa alterar(Tarefa tarefa);
	
	Tarefa buscarPorId(Long id);
	
	List<Tarefa> buscarTodos();
}

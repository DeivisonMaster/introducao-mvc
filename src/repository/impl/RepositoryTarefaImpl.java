package repository.impl;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Tarefa;
import repository.RepositoryTarefa;
import util.JPAUtil;

@Dependent
public class RepositoryTarefaImpl implements RepositoryTarefa {
	// Classe responsavel por se comunicar com BD
	
	private EntityManager entityManager;
	
	public RepositoryTarefaImpl() {
		this.entityManager = new JPAUtil().getEntity();
	}
	
	// Gerenciamento manual de transações para testes 
	@Override
	public void incluir(Tarefa tarefa) {
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(tarefa);
		System.out.println("tarefa " + tarefa.getDescricao() + " salva com sucesso!");
		this.entityManager.getTransaction().commit();
	}

	@Override
	public Tarefa alterar(Tarefa tarefa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarefa buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tarefa> buscarTodos() {
		TypedQuery<Tarefa> lista = this.entityManager.createQuery("from Tarefa", Tarefa.class);
		return lista.getResultList();
	}

}


















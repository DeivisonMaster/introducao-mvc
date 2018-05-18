package controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Tarefa;
import service.ServiceTarefa;

@Named
@RequestScoped
public class ControllerConsultaTarefa {
	
	@Inject
	private ServiceTarefa serviceTarefa;
	private boolean habilita = false;
	
	
	public boolean consultar(){
		return this.habilita = true;
	}
	
	public Tarefa buscaPorId(Long id){
		return serviceTarefa.buscarPorId(id);
	}
	public List<Tarefa> listarTarefas(){
		return serviceTarefa.buscarTodos();
	}

	public ServiceTarefa getServiceTarefa() {
		return serviceTarefa;
	}

	public void setServiceTarefa(ServiceTarefa serviceTarefa) {
		this.serviceTarefa = serviceTarefa;
	}

	public boolean isHabilita() {
		return habilita;
	}
	public void setHabilita(boolean habilita) {
		this.habilita = habilita;
	}
	
	
	
}

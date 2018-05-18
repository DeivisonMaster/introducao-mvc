package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Tarefa;
import service.ServiceTarefa;

@Named
@RequestScoped
public class ControllerCadastroTarefa {
	// Comunicação entre camadas via interface e não pela implementação diretamente
	
	@Inject
	private ServiceTarefa serviceTarefa;
	
	private Tarefa tarefa;
	
	public ControllerCadastroTarefa() {
		this.tarefa = new Tarefa();
	}
	
	public void salvar(){
		this.serviceTarefa.incluir(tarefa);
		this.tarefa = new Tarefa();
	}
	
	public Tarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
}

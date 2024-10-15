package servicos;

import modelos.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas(){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void listarTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma Tarefa encontrada!");
        }else {
            for (int i = 0; i < tarefas.size(); i++){
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void marcarTarefaConcluida(int indice){
        if(indice >= 0 && indice < tarefas.size()){
            tarefas.get(indice).marcarComoConcluida();
            System.out.println("Tarefa concluida.");
        }else {
            System.out.println("Indice Inválido.");
        }
    }

    public void removerTarefa(int indice){
        if(indice >= 0 && indice < tarefas.size()){
            tarefas.remove(indice);
            System.out.println("Tarefa removida.");
        }else {
            System.out.println("Indice inválido.");
        }
    }

    public void listarTarefasConcluidas() {
        boolean encontrouConcluidas = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println(tarefa);
                encontrouConcluidas = true;
            }
        }
        if (!encontrouConcluidas) {
            System.out.println("Nenhuma tarefa concluída encontrada.");
        }
    }
}
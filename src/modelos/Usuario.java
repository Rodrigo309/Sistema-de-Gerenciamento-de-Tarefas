package modelos;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Tarefa> tarefas;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void removeTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

}

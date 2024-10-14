package modelos;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String dataCriacao;
    private boolean concluida;
    private String prioridade;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public Tarefa(String titulo, String descricao, String prioridade){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;

        this.concluida = false;
    }



    public void marcarComoConcluida(){
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo ='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", concluida=" + concluida +
                ", prioridade='" + prioridade + '\'' +
                '}';
    }
}

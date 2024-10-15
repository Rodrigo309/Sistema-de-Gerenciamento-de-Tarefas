package principal;

import modelos.Tarefa;
import servicos.GerenciadorTarefas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
        Scanner leitura = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu de Tarefas ---");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Listar todas as tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Listar tarefas concluídas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    // Criar nova tarefa
                    System.out.print("Título da tarefa: ");
                    String titulo = leitura.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricao = leitura.nextLine();
                    System.out.print("Prioridade da tarefa (Alta, Média, Baixa): ");
                    String prioridade = leitura.nextLine();
                    Tarefa novaTarefa = new Tarefa(titulo, descricao, prioridade);
                    gerenciadorTarefas.adicionarTarefa(novaTarefa);
                    System.out.println("Tarefa adicionada.");
                    break;

                case 2:
                    gerenciadorTarefas.listarTarefas();
                    break;

                case 3:
                    gerenciadorTarefas.listarTarefas();
                    System.out.print("Número da tarefa para marcar como concluída: ");
                    int indiceConcluir = leitura.nextInt();
                    gerenciadorTarefas.marcarTarefaConcluida(indiceConcluir - 1); // Ajusta o índice (base 0)
                    break;

                case 4:
                    System.out.print("Número da tarefa para remover: ");
                    int indiceRemover = leitura.nextInt();
                    gerenciadorTarefas.removerTarefa(indiceRemover - 1); // Ajusta o índice (base 0)
                    break;

                case 5:
                    gerenciadorTarefas.listarTarefasConcluidas();
                    break;


                case 0:
                    System.out.println("Saindo... ");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 0);

            leitura.close();
    }
}
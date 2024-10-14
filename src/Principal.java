import modelos.Tarefa;
import modelos.Usuario;
import servicos.GerenciadorTarefas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner leitura = new Scanner(System.in);

        boolean rodando = true;

        while (rodando){
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Editar Tarefa");
            System.out.println("5. Remover Tarefa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o seu nome: ");
                    String addNome = leitura.nextLine();
                    System.out.println("Digite o seu email: ");
                    String addEmail = leitura.nextLine();
                    Usuario novoUsuario = new Usuario(addNome, addEmail);
                    gerenciador.registrarUsuario(novoUsuario);
                    System.out.println("Usuário Adicionado!");
                    break;
                case 2:
                    System.out.println("Digite o email do usuário: ");
                    String emailAdd = leitura.nextLine();
                    System.out.println("Digite o titulo da tarefa: ");
                    String titulo = leitura.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = leitura.nextLine();
                    System.out.println("Digite a prioridade da tarefa (baixa, média, alta): ");
                    String prioridade = leitura.nextLine();

                    Tarefa novaTarefa = new Tarefa(titulo, descricao, prioridade);
                    Usuario usuario = gerenciador.obterUsuario(emailAdd);

                    if(usuario != null){
                        usuario.adicionarTarefa(novaTarefa);
                        System.out.println("Tarefa Adicionada!");
                    }else {
                        System.out.println("Usuário não encontrado.");
                    }

                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }


        }
    }
}

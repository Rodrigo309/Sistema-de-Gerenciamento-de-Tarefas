# Sistema de Gerenciamento de Tarefas

Este projeto foi desenvolvido como parte das práticas do curso de **Java Orientado a Objetos** da Alura. Ele consiste em um sistema simples de gerenciamento de tarefas para um único usuário, com funcionalidades que permitem a criação, listagem, remoção e conclusão de tarefas.

## Funcionalidades

- Adicionar novas tarefas com título, descrição e prioridade.
- Listar todas as tarefas.
- Marcar tarefas como concluídas.
- Remover tarefas.
- Filtrar e listar apenas as tarefas concluídas.
- Exibir informações detalhadas de cada tarefa, como data de criação e status (concluída ou pendente).

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para desenvolver o sistema.
- **Programação Orientada a Objetos (POO)**: Estruturação do código com classes, objetos, encapsulamento e métodos.

## Estrutura do Projeto

O sistema está organizado da seguinte forma:

- **Pacote `modelos`**: Contém a classe `Tarefa`, que representa as tarefas do usuário.
- **Pacote `servicos`**: Contém a classe `GerenciadorTarefas`, responsável pela lógica de gerenciamento das tarefas.

### Classe `Tarefa`

A classe `Tarefa` representa uma tarefa individual, contendo os seguintes atributos:

- `titulo`: Título da tarefa.
- `descricao`: Descrição da tarefa.
- `prioridade`: Prioridade da tarefa (alta, média, baixa).
- `dataCriacao`: Data e hora em que a tarefa foi criada.
- `concluida`: Status de conclusão (verdadeiro ou falso).

### Classe `GerenciadorTarefas`

A classe `GerenciadorTarefas` é responsável por gerenciar a lista de tarefas. Ela inclui métodos como:

- `adicionarTarefa(Tarefa tarefa)`: Adiciona uma nova tarefa à lista.
- `listarTarefas()`: Exibe todas as tarefas, mostrando seu título e status de conclusão.
- `marcarTarefaComoConcluida(int indice)`: Marca uma tarefa específica como concluída.
- `removerTarefa(int indice)`: Remove uma tarefa com base em seu índice.
- `listarTarefasConcluidas()`: Lista apenas as tarefas que já foram concluídas.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:
    ```bash
    git clone https://github.com/seu-usuario/gerenciador-tarefas.git
    ```

2. Importe o projeto para sua IDE de preferência (Eclipse, IntelliJ, etc.).

3. Compile e execute a classe principal, que gerencia a interação com o sistema.

## Exemplo de Uso

Após iniciar o sistema, o usuário pode interagir com o gerenciador de tarefas adicionando, listando e marcando tarefas como concluídas. Um exemplo de interação:

1. **Adicionar Tarefa**:
    - Título: "Estudar Java"
    - Descrição: "Completar o curso de Java Orientado a Objetos na Alura"
    - Prioridade: Alta

2. **Listar Tarefas**:
    - 1. Estudar Java [Pendente]

3. **Marcar como Concluída**:
    - Tarefa marcada como concluída.

4. **Listar Tarefas**:
    - 1. Estudar Java [Concluída]

## Aprendizados

Durante o desenvolvimento deste projeto, apliquei conceitos fundamentais de Programação Orientada a Objetos, como:

- **Encapsulamento**: Controle de acesso adequado para atributos e métodos.
- **Classes e Objetos**: Estruturação de entidades do sistema usando POO.
- **Data e Hora**: Utilização da API de tempo do Java para lidar com datas.

## Próximos Passos

- Adicionar suporte para múltiplos usuários.
- Salvar as tarefas em um arquivo para persistência de dados entre execuções.


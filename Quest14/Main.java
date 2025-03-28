package Quest14;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeTarefa tarefa1 = new GerenciadorDeTarefa("Estudar Java", 1);
        GerenciadorDeTarefa tarefa2 = new GerenciadorDeTarefa("Fazer compras", 2);
        GerenciadorDeTarefa tarefa3 = new GerenciadorDeTarefa("Ligar para o médico", 3, true);

        System.out.println("--- Tarefas Iniciais ---");
        tarefa1.exibirTarefa();
        tarefa2.exibirTarefa();
        tarefa3.exibirTarefa();

        System.out.println("\n--- Concluindo Tarefas ---");
        tarefa1.concluirTarefa();
        tarefa2.concluirTarefa();
        tarefa1.exibirTarefa();
        tarefa2.exibirTarefa();

        System.out.println("\n--- Mudando Prioridades ---");
        tarefa1.mudarPrioridade(3);
        tarefa3.mudarPrioridade(1);
        tarefa1.exibirTarefa();
        tarefa3.exibirTarefa();

        System.out.println("\n--- Resetando Tarefas ---");
        tarefa1.resetarTarefa();
        tarefa1.exibirTarefa();

        try {
            tarefa1.setPrioridade(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a prioridade: " + e.getMessage());
        }

        tarefa1.exibirTarefa();
    }
}
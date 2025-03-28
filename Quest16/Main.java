package Quest16;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeCursos curso1 = new GerenciadorDeCursos("Java para Iniciantes", "Programação", 40);
        GerenciadorDeCursos curso2 = new GerenciadorDeCursos("Design Gráfico", "Design", 30);
        GerenciadorDeCursos curso3 = new GerenciadorDeCursos("Marketing Digital", "Marketing");

        System.out.println("--- Cursos Iniciais ---");
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();

        System.out.println("\n--- Inscrição de Alunos ---");
        curso1.inscreverAluno();
        curso2.inscreverAluno();
        curso3.inscreverAluno();
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();

        System.out.println("\n--- Cancelamento de Inscrições ---");
        curso1.cancelarInscricao();
        curso2.cancelarInscricao();
        curso3.cancelarInscricao();
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();

        System.out.println("\n--- Atualização de Carga Horária ---");
        curso1.atualizarCargaHoraria(45);
        curso2.atualizarCargaHoraria(35);
        curso3.atualizarCargaHoraria(55);
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();

        try {
            curso1.setCargaHoraria(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a carga horária: " + e.getMessage());
        }

        curso1.exibirInformacoes();
    }
}
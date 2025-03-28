package Quest12;

public class Main {
    public static void main(String[] args) {
        SessaoCinema sessao1 = new SessaoCinema("Vingadores: Ultimato", "20:00", 100);
        SessaoCinema sessao2 = new SessaoCinema("Homem-Aranha: Sem Volta para Casa", "18:00");
        SessaoCinema sessao3 = new SessaoCinema("Avatar: O Caminho da Água", "22:00", 120);

        System.out.println("--- Informações Iniciais ---");
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println("\n--- Venda de Ingressos ---");
        sessao1.venderIngresso();
        sessao2.venderIngresso();
        sessao3.venderIngresso();
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println("\n--- Cancelamento de Ingressos ---");
        sessao1.cancelarIngresso();
        sessao2.cancelarIngresso();
        sessao3.cancelarIngresso();
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        System.out.println("\n--- Alteração de Horários ---");
        sessao1.alterarHorario("21:00");
        sessao2.alterarHorario("19:00");
        sessao3.alterarHorario("23:00");
        sessao1.exibirInfoSessao();
        sessao2.exibirInfoSessao();
        sessao3.exibirInfoSessao();

        try {
            sessao1.setCapacidadeTotal(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a capacidade total: " + e.getMessage());
        }

        sessao1.exibirInfoSessao();
    }
}
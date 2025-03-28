package Quest18;

public class Main {
    public static void main(String[] args) {
        MonitorDeAtividadesFisicas atividade1 = new MonitorDeAtividadesFisicas("Corrida");
        MonitorDeAtividadesFisicas atividade2 = new MonitorDeAtividadesFisicas("Natação", 30, 300);

        System.out.println("--- Atividades Iniciais ---");
        atividade1.exibirAtividade();
        atividade2.exibirAtividade();

        System.out.println("\n--- Registrando Atividades ---");
        atividade1.registrarAtividade(45);
        atividade2.registrarAtividade(60);
        atividade1.exibirAtividade();
        atividade2.exibirAtividade();

        System.out.println("\n--- Comparando Calorias ---");
        atividade1.compararCalorias(atividade2);
        atividade2.compararCalorias(atividade1);

        System.out.println("\n--- Alterando Tipo de Atividade ---");
        atividade1.alterarTipoDeAtividade("Ciclismo");
        atividade1.exibirAtividade();

        try {
            atividade1.setDuracao(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a duração: " + e.getMessage());
        }

        atividade1.exibirAtividade();
    }
}
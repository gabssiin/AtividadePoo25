package Quest14;

public class GerenciadorDeTarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    public GerenciadorDeTarefa() {
    }

    public GerenciadorDeTarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade;
    }

    public GerenciadorDeTarefa(String descricao, int prioridade, boolean concluida) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = concluida;
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

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if (prioridade < 0) {
            throw new IllegalArgumentException("Prioridade inválida: " + prioridade);
        }
        this.prioridade = prioridade;
    }

    public void concluirTarefa() {
        this.concluida = true;
        System.out.println("Tarefa '" + descricao + "' marcada como concluída.");
    }

    public void mudarPrioridade(int novaPrioridade) {
        this.prioridade = novaPrioridade;
        System.out.println("Prioridade da tarefa '" + descricao + "' alterada para: " + novaPrioridade);
    }

    public void exibirTarefa() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Concluída: " + (concluida ? "Sim" : "Não"));
        System.out.println("Prioridade: " + prioridade);
    }

    public void resetarTarefa() {
        this.concluida = false;
        System.out.println("Tarefa '" + descricao + "' marcada como não concluída.");
    }
}
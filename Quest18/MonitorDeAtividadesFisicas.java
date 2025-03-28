package Quest18;

public class MonitorDeAtividadesFisicas {
    private String tipoDeAtividade;
    private int duracao;
    private int caloriasQueimadas;

    public MonitorDeAtividadesFisicas() {
    }

    public MonitorDeAtividadesFisicas(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = 0;
        this.caloriasQueimadas = 0;
    }

    public MonitorDeAtividadesFisicas(String tipoDeAtividade, int duracao, int caloriasQueimadas) {
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = duracao;
        this.caloriasQueimadas = caloriasQueimadas;
    }

    public String getTipoDeAtividade() {
        return tipoDeAtividade;
    }

    public void setTipoDeAtividade(String tipoDeAtividade) {
        this.tipoDeAtividade = tipoDeAtividade;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao < 0) {
            throw new IllegalArgumentException("Duração inválida: " + duracao);
        }
        this.duracao = duracao;
    }

    public int getCaloriasQueimadas() {
        return caloriasQueimadas;
    }

    public void setCaloriasQueimadas(int caloriasQueimadas) {
        if (caloriasQueimadas < 0) {
            throw new IllegalArgumentException("Calorias queimadas inválidas: " + caloriasQueimadas);
        }
        this.caloriasQueimadas = caloriasQueimadas;
    }

    public void registrarAtividade(int duracao) {
        this.duracao = duracao;
        this.caloriasQueimadas = duracao * 10;
        System.out.println("Atividade registrada: " + tipoDeAtividade + ", Duração: " + duracao + " minutos, Calorias queimadas: " + caloriasQueimadas);
    }

    public void alterarTipoDeAtividade(String novoTipo) {
        this.tipoDeAtividade = novoTipo;
        System.out.println("Tipo de atividade alterado para: " + novoTipo);
    }

    public void exibirAtividade() {
        System.out.println("Tipo de atividade: " + tipoDeAtividade);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Calorias queimadas: " + caloriasQueimadas);
    }

    public void compararCalorias(MonitorDeAtividadesFisicas outraAtividade) {
        System.out.println("Comparando calorias queimadas:");
        if (caloriasQueimadas > outraAtividade.getCaloriasQueimadas()) {
            System.out.println("Você queimou mais calorias em " + tipoDeAtividade + ".");
        } else if (caloriasQueimadas < outraAtividade.getCaloriasQueimadas()) {
            System.out.println("Você queimou mais calorias em " + outraAtividade.getTipoDeAtividade() + ".");
        } else {
            System.out.println("Você queimou a mesma quantidade de calorias em ambas as atividades.");
        }
    }
}
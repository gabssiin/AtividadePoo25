package Quest17;

public class SistemaDeVotacao {
    private String candidato;
    private int votosRecebidos;

    public SistemaDeVotacao() {
    }

    public SistemaDeVotacao(String candidato) {
        this.candidato = candidato;
        this.votosRecebidos = 0;
    }

    public String getCandidato() {
        return candidato;
    }

    public int getVotosRecebidos() {
        return votosRecebidos;
    }

    public void adicionarVoto() {
        this.votosRecebidos++;
        System.out.println("Voto adicionado para " + candidato + ".");
    }

    public void zerarVotos() {
        this.votosRecebidos = 0;
        System.out.println("Votos de " + candidato + " zerados.");
    }

    public void exibirResultado() {
        System.out.println("Candidato: " + candidato);
        System.out.println("Votos recebidos: " + votosRecebidos);
    }

    public void compararVotos(SistemaDeVotacao outraVotacao) {
        System.out.println("Comparando votos de " + candidato + " e " + outraVotacao.getCandidato() + ":");
        if (this.votosRecebidos > outraVotacao.getVotosRecebidos()) {
            System.out.println(candidato + " tem mais votos.");
        } else if (this.votosRecebidos < outraVotacao.getVotosRecebidos()) {
            System.out.println(outraVotacao.getCandidato() + " tem mais votos.");
        } else {
            System.out.println("Ambos os candidatos têm o mesmo número de votos.");
        }
    }
}
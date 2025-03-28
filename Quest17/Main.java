package Quest17;

public class Main {
    public static void main(String[] args) {
        SistemaDeVotacao candidato1 = new SistemaDeVotacao("João Cleber");
        SistemaDeVotacao candidato2 = new SistemaDeVotacao("Maria Joaquina");
        SistemaDeVotacao candidato3 = new SistemaDeVotacao("Carlos José");

        System.out.println("--- Votação Inicial ---");
        candidato1.exibirResultado();
        candidato2.exibirResultado();
        candidato3.exibirResultado();

        System.out.println("\n--- Adicionando Votos ---");
        candidato1.adicionarVoto();
        candidato1.adicionarVoto();
        candidato2.adicionarVoto();
        candidato3.adicionarVoto();
        candidato1.exibirResultado();
        candidato2.exibirResultado();
        candidato3.exibirResultado();

        System.out.println("\n--- Comparando Votos ---");
        candidato1.compararVotos(candidato2);
        candidato2.compararVotos(candidato3);
        candidato3.compararVotos(candidato1);

        System.out.println("\n--- Zerando Votos ---");
        candidato1.zerarVotos();
        candidato1.exibirResultado();
    }
}
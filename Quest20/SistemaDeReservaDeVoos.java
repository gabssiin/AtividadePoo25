package Quest20;

public class SistemaDeReservaDeVoos {

    private String numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;
    private boolean confirmada;

    public SistemaDeReservaDeVoos() {
    }

    public SistemaDeReservaDeVoos(String numeroDoVoo, String nomeDoPassageiro, String classe) {
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
        this.confirmada = false;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getNomeDoPassageiro() {
        return nomeDoPassageiro;
    }

    public void setNomeDoPassageiro(String nomeDoPassageiro) {
        this.nomeDoPassageiro = nomeDoPassageiro;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    public void alterarClasse(String novaClasse) {
        this.classe = novaClasse;
        System.out.println("Classe da reserva alterada para: " + novaClasse);
    }

    public void cancelarReserva() {
        this.confirmada = false;
        System.out.println("Reserva do voo " + numeroDoVoo + " cancelada.");
    }

    public void confirmarReserva() {
        this.confirmada = true;
        System.out.println("Reserva do voo " + numeroDoVoo + " confirmada.");
    }

    public void exibirDetalhes() {
        System.out.println("Número do voo: " + numeroDoVoo);
        System.out.println("Nome do passageiro: " + nomeDoPassageiro);
        System.out.println("Classe: " + classe);
        System.out.println("Confirmada: " + (confirmada ? "Sim" : "Não"));
    }
}
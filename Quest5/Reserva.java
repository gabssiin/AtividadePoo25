package Quest5;

public class Reserva {
    private String nomeHosp;
    private String tipoQuarto;
    private int numNoites;

    public Reserva() {
    }

    public Reserva(String nomeHosp, String tipoQuarto, int numNoites) {
        this.nomeHosp = nomeHosp;
        this.tipoQuarto = tipoQuarto;
        this.numNoites = numNoites;
    }

    public Reserva(String nomeHosp, String tipoQuarto) {
        this.nomeHosp = nomeHosp;
        this.tipoQuarto = tipoQuarto;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public int getNumNoites() {
        return numNoites;
    }

    public void setNomeHosp(String nomeHosp) {
        this.nomeHosp = nomeHosp;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public void setNumNoites(int numNoites) {
        if (numNoites <= 0) {
            throw new IllegalArgumentException("Número de noites inválido: " + numNoites);
        }
        this.numNoites = numNoites;
    }

    public void exibirInformacoes() {
        System.out.println("---------------------");
        System.out.println("Nome do hóspede: " + nomeHosp);
        System.out.println(" ");
        System.out.println("Tipo do quarto: " + tipoQuarto);
        System.out.println(" ");
        System.out.println("Número de noites alugadas: " + numNoites);
        System.out.println(" ");
    }
}
package Quest9;

public class Paciente {
    private String nomePac;
    private int idadePac;
    private String diag;

    public Paciente() {
    }

    public Paciente(String nomePac, int idadePac, String diag) {
        this.nomePac = nomePac;
        this.idadePac = idadePac;
        this.diag = diag;
    }

    public Paciente(String nomePac, int idadePac) {
        this.nomePac = nomePac;
        this.idadePac = idadePac;
    }

    public String getNomePac() {
        return nomePac;
    }

    public int getIdadePac() {
        return idadePac;
    }

    public String getDiag() {
        return diag;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public void setIdadePac(int idadePac) {
        if (idadePac < 0) {
            throw new IllegalArgumentException("Idade inválida: " + idadePac);
        }
        this.idadePac = idadePac;
    }

    public void setDiag(String diag) {
        this.diag = diag;
    }

    public void exibirPaciente() {
        System.out.println("------------------");
        System.out.println("Resultado dos exames: ");
        System.out.println("Nome: " + nomePac);
        System.out.println(" ");
        System.out.println("Idade: " + idadePac);
        System.out.println(" ");
        System.out.println("Diagnóstico: " + diag);
        System.out.println("------");
    }
}
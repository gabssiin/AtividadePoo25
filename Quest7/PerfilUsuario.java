package Quest7;

public class PerfilUsuario {
    private String nomeUsuario;
    private String bio;
    private int numeroSeguidores;

    public PerfilUsuario() {
    }

    public PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numeroSeguidores = numeroSeguidores;
    }

    public PerfilUsuario(String nomeUsuario, String bio) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getBio() {
        return bio;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        if (numeroSeguidores < 0) {
            throw new IllegalArgumentException("Número de seguidores inválido: " + numeroSeguidores);
        }
        this.numeroSeguidores = numeroSeguidores;
    }

    public void exibirDetalhes() {
        System.out.println("--------------");
        System.out.println(" ");
        System.out.println("Nome de Usuário: " + nomeUsuario);
        System.out.println(" ");
        System.out.println("Bio: " + bio);
        System.out.println(" ");
        System.out.println("Número de Seguidores: " + numeroSeguidores);
        System.out.println("-----------------------");
    }
}
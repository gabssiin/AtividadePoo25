package Quest13;

public class AgendaTelefonica {

    private String nome;
    private String telefone;
    private String email;

    public AgendaTelefonica() {
    }

    public AgendaTelefonica(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public AgendaTelefonica(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void alterarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Telefone de " + nome + " alterado para: " + novoTelefone);
    }

    public void alterarEmail(String novoEmail) {
        if (validarEmail(novoEmail)) {
            this.email = novoEmail;
            System.out.println("Email de " + nome + " alterado para: " + novoEmail);
        } else {
            System.out.println("Email inválido. A alteração não foi realizada.");
        }
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    public boolean validarEmail(String email) {
        return email.contains("@");
    }
}
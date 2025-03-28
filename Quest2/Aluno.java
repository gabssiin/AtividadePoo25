package Quest2;

public class Aluno {
    private String nome;
    private int idade;
    private int serie;

    public Aluno() {
    }

    public Aluno(String nome, int idade, int serie) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSerie(int serie) {
        if (serie <= 0 || serie > 9) {
            throw new IllegalArgumentException("Série inválida: " + serie);
        }
        this.serie = serie;
    }

    public void exibirAlunos() {
        System.out.println("----------------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println(" ");
        System.out.println("Idade: " + idade + " anos");
        System.out.println(" ");
        System.out.println(serie + "º Série");
    }
}
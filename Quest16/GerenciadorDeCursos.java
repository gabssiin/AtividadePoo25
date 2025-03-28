package Quest16;

public class GerenciadorDeCursos {
    private String nome;
    private String categoria;
    private int cargaHoraria;
    private int numeroDeAlunosInscritos;

    public GerenciadorDeCursos() {
    }

    public GerenciadorDeCursos(String nome, String categoria, int cargaHoraria) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunosInscritos = 0;
    }

    public GerenciadorDeCursos(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = 40; // Valor padrão
        this.numeroDeAlunosInscritos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria < 0) {
            throw new IllegalArgumentException("Carga horária inválida: " + cargaHoraria);
        }
        this.cargaHoraria = cargaHoraria;
    }

    public int getNumeroDeAlunosInscritos() {
        return numeroDeAlunosInscritos;
    }

    public void setNumeroDeAlunosInscritos(int numeroDeAlunosInscritos) {
        if (numeroDeAlunosInscritos < 0) {
            throw new IllegalArgumentException("Número de alunos inscritos inválido: " + numeroDeAlunosInscritos);
        }
        this.numeroDeAlunosInscritos = numeroDeAlunosInscritos;
    }

    public void inscreverAluno() {
        this.numeroDeAlunosInscritos++;
        System.out.println("Aluno inscrito no curso '" + nome + "'.");
    }

    public void cancelarInscricao() {
        if (this.numeroDeAlunosInscritos > 0) {
            this.numeroDeAlunosInscritos--;
            System.out.println("Inscrição cancelada no curso '" + nome + "'.");
        } else {
            System.out.println("Não há alunos inscritos no curso '" + nome + "'.");
        }
    }

    public void atualizarCargaHoraria(int novaCargaHoraria) {
        this.cargaHoraria = novaCargaHoraria;
        System.out.println("Carga horária do curso '" + nome + "' atualizada para: " + novaCargaHoraria + " horas.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Carga horária: " + cargaHoraria + " horas");
        System.out.println("Número de alunos inscritos: " + numeroDeAlunosInscritos);
    }
}
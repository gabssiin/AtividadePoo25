package Quest1;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao <= 0 || anoPublicacao > 2023) {
            throw new IllegalArgumentException("Ano de publicação inválido: " + anoPublicacao);
        }
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInformacoes() {
        System.out.println("-----------------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println(" ");
        System.out.println("Autor: " + autor);
        System.out.println(" ");
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println(" ");
        System.out.println("-----------------------------------------");
    }
}
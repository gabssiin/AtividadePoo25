package Quest1;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Capitães de Areia", "Jorge Amado", 1937);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println("Exibindo todas informações: ");
        System.out.println(" ");
        livro1.exibirInformacoes();
        System.out.println(" ");
        livro2.exibirInformacoes();
        System.out.println(" ");
        livro3.exibirInformacoes();

      
        System.out.println(" ");
        System.out.println("Autor do terceiro livro: " + livro3.getAutor());

      
        livro1.setAnoPublicacao(1979);
        System.out.println(" ");
        System.out.println("Exibindo novamente as informações, (após alteração): ");
        livro1.exibirInformacoes();

        try {
            livro1.setAnoPublicacao(2026); // Ano inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o ano de publicação: " + e.getMessage());
        }

        livro1.exibirInformacoes();
    }
}
package Quest15;

public class Main {
    public static void main(String[] args) {
        ControleDeEstoque produtoEmEstoque1 = new ControleDeEstoque("Escova", 20, 10.50);
        ControleDeEstoque produtoEmEstoque2 = new ControleDeEstoque("Mouse", 10, 50.00);
        ControleDeEstoque produtoEmEstoque3 = new ControleDeEstoque("Garrafa", 100, 25.00);

        System.out.println("Informações: ");
        produtoEmEstoque1.exibirProdutoEstoque();
        produtoEmEstoque2.exibirProdutoEstoque();
        produtoEmEstoque3.exibirProdutoEstoque();

        System.out.println("Uso de get: ");
        System.out.println("O preço do " + produtoEmEstoque1.getNomeEstoque() + " é: " + produtoEmEstoque1.getPrecoUnitario());
        System.out.println("No estoque de " + produtoEmEstoque2.getNomeEstoque() + " tem: " + produtoEmEstoque2.getQuantidadeEstoque());

        produtoEmEstoque3.setPrecoUnitario(20.99);
        produtoEmEstoque3.setQuantidadeEstoque(50);
        produtoEmEstoque3.exibirProdutoEstoque();

        System.out.println("Uso das novas funções");
        System.out.println("Adicionar estoque: ");
        produtoEmEstoque1.adicionarEstoque(20);
        produtoEmEstoque1.exibirProdutoEstoque();
        System.out.println("------------------");
        System.out.println("Reduzir estoque: ");
        produtoEmEstoque2.removerEstoque(5);
        produtoEmEstoque2.exibirProdutoEstoque();

        System.out.println("-----------------");
        System.out.println("Atualizar preço de produto: ");
        produtoEmEstoque3.atualizarPreco(24.00);
        produtoEmEstoque3.exibirProdutoEstoque();

        try {
            produtoEmEstoque1.adicionarEstoque(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar estoque: " + e.getMessage());
        }

        produtoEmEstoque1.exibirProdutoEstoque();
    }
}
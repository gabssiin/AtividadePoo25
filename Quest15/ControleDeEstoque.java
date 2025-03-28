package Quest15;

public class ControleDeEstoque {
    private String nomeEstoque;
    private int quantidadeEstoque;
    private double precoUnitario;

    public ControleDeEstoque() {
    }

    public ControleDeEstoque(String nomeEstoque, int quantidadeEstoque, double precoUnitario) {
        this.nomeEstoque = nomeEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnitario = precoUnitario;
    }

    public ControleDeEstoque(String nomeEstoque, int quantidadeEstoque) {
        this.nomeEstoque = nomeEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnitario = 0.0; // Valor padrão
    }

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        this.nomeEstoque = nomeEstoque;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario < 0) {
            throw new IllegalArgumentException("Preço unitário inválido: " + precoUnitario);
        }
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade em estoque inválida: " + quantidadeEstoque);
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade a adicionar inválida: " + quantidadeEstoque);
        }
        this.quantidadeEstoque += quantidadeEstoque;
    }

    public void removerEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0 || quantidadeEstoque > this.quantidadeEstoque) {
            throw new IllegalArgumentException("Quantidade a remover inválida: " + quantidadeEstoque);
        }
        this.quantidadeEstoque -= quantidadeEstoque;
    }

    public void atualizarPreco(double novoPreco) {
        this.precoUnitario = novoPreco;
    }

    public void exibirProdutoEstoque() {
        System.out.println("-------------");
        System.out.println("Exibir produtos no estoque: ");
        System.out.println("Nome do produto: " + nomeEstoque);
        System.out.println("Quantidade do produto em estoque: " + quantidadeEstoque);
        System.out.println("Preço da unidade do produto: " + precoUnitario);
    }
}
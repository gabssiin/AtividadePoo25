package Quest3;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String categoriaProduto;

    public Produto() {
    }

    public Produto(String nomeProduto, double precoProduto, String categoriaProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.categoriaProduto = categoriaProduto;
    }

    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto < 0) {
            throw new IllegalArgumentException("Preço inválido: " + precoProduto);
        }
        this.precoProduto = precoProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public void exibirProdutos() {
        System.out.println("--------------------------------------");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("");
        System.out.println("Preço do produto: " + precoProduto);
        System.out.println(" ");
        System.out.println("Categoria do produto: " + categoriaProduto);
        System.out.println(" ");
    }
}
package Quest3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Tesoura", 10.50, "utensílios");
        Produto produto2 = new Produto("Maracujá", 0.50, "Fruta");
        Produto produto3 = new Produto("Mouse", 25.99, "Periférico");

        System.out.println("Exibindo as informações: ");
        produto1.exibirProdutos();
        System.out.println(" ");
        produto2.exibirProdutos();
        System.out.println(" ");
        produto3.exibirProdutos();
        System.out.println("-----------");

        System.out.println("Uso de get: ");
        System.out.println("O preço do produto: " + produto1.getNomeProduto() + " é: " + produto1.getPrecoProduto());
        System.out.println("---------------------- ");

        System.out.println("Uso de set: ");
        produto3.setPrecoProduto(101.99);
        System.out.println(produto3.getNomeProduto() + " agora custa : " + produto3.getPrecoProduto());

        try {
            produto2.setPrecoProduto(-10.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o preço: " + e.getMessage());
        }

        produto2.exibirProdutos();
    }
}
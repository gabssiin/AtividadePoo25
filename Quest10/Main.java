package Quest10;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(123, "Hamburguer, Batata Frita, Refrigerante", 35.50);
        Pedido pedido2 = new Pedido(456, "Pizza Grande, Coca-Cola", 55.00);
        Pedido pedido3 = new Pedido(789, "Salada Caesar, Suco de Laranja", 28.00);

        System.out.println("Detalhes dos Pedidos:");
        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
        pedido3.exibirDetalhes();

        System.out.println("Número do pedido 1: " + pedido1.getNumeroPedido());
        System.out.println("Valor total do pedido 2: R$" + pedido2.getValorTotal());

        pedido1.setValorTotal(38.00);
        pedido3.setDescricaoItens("Salada Caesar, Suco de Laranja, Sobremesa");

        System.out.println("\nDetalhes dos Pedidos após alterações:");
        pedido1.exibirDetalhes();
        pedido2.exibirDetalhes();
        pedido3.exibirDetalhes();

        try {
            pedido2.setValorTotal(-10.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o valor total: " + e.getMessage());
        }

        pedido2.exibirDetalhes();
    }
}
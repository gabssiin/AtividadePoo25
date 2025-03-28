package Quest10;

public class Pedido {
    private int numeroPedido;
    private String descricaoItens;
    private double valorTotal;

    public Pedido() {
    }

    public Pedido(int numeroPedido, String descricaoItens, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
        this.valorTotal = valorTotal;
    }

    public Pedido(int numeroPedido, String descricaoItens) {
        this.numeroPedido = numeroPedido;
        this.descricaoItens = descricaoItens;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescricaoItens() {
        return descricaoItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setDescricaoItens(String descricaoItens) {
        this.descricaoItens = descricaoItens;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor total inválido: " + valorTotal);
        }
        this.valorTotal = valorTotal;
    }

    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Descrição dos Itens: " + descricaoItens);
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("----------------------");
    }
}
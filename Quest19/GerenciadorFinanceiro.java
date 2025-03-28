package Quest19;

import java.util.ArrayList;

public class GerenciadorFinanceiro {

    private String descricao;
    private double valor;
    private String tipo;

    public GerenciadorFinanceiro() {
    }

    public GerenciadorFinanceiro(String descricao, double valor, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public GerenciadorFinanceiro(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = "Despesa"; // Valor padrão
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido: " + valor);
        }
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void alterarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
        System.out.println("Descrição alterada para: " + novaDescricao);
    }

    public void exibirTransacao() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Tipo: " + tipo);
    }

    public static double calcularSaldo(ArrayList<GerenciadorFinanceiro> transacoes) {
        double saldo = 0;
        for (GerenciadorFinanceiro transacao : transacoes) {
            if (transacao.getTipo().equalsIgnoreCase("Receita")) {
                saldo += transacao.getValor();
            } else if (transacao.getTipo().equalsIgnoreCase("Despesa")) {
                saldo -= transacao.getValor();
            }
        }
        return saldo;
    }
}
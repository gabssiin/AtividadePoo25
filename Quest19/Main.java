package Quest19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GerenciadorFinanceiro> transacoes = new ArrayList<>();
        transacoes.add(new GerenciadorFinanceiro("Salário", 2500, "Receita"));
        transacoes.add(new GerenciadorFinanceiro("Aluguel", 1200, "Despesa"));
        transacoes.add(new GerenciadorFinanceiro("Supermercado", 300));
        transacoes.add(new GerenciadorFinanceiro("Freelance", 500, "Receita"));

        System.out.println("--- Transações ---");
        for (GerenciadorFinanceiro transacao : transacoes) {
            transacao.exibirTransacao();
        }

        System.out.println("\n--- Saldo ---");
        System.out.println("Saldo atual: R$" + GerenciadorFinanceiro.calcularSaldo(transacoes));

        transacoes.get(0).alterarDescricao("Salário Mensal");
        transacoes.get(2).setTipo("Despesa");
        System.out.println("\n--- Transações Atualizadas ---");
        for (GerenciadorFinanceiro transacao : transacoes) {
            transacao.exibirTransacao();
        }

        try {
            transacoes.get(1).setValor(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o valor: " + e.getMessage());
        }

        transacoes.get(1).exibirTransacao();
    }
}
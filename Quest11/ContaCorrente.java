package Quest11;

public class ContaCorrente {
    private String numDaConta;
    private double saldo;
    private String nomeDoTitular;

    public ContaCorrente() {
    }

    public ContaCorrente(String numDaConta, double saldo, String nomeDoTitular) {
        this.numDaConta = numDaConta;
        this.saldo = saldo;
        this.nomeDoTitular = nomeDoTitular;
    }

    public ContaCorrente(String numDaConta, String nomeDoTitular) {
        this.numDaConta = numDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getNumDaConta() {
        return numDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void setNumDaConta(String numDaConta) {
        this.numDaConta = numDaConta;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo inválido: " + saldo);
        }
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para a conta " + destino.getNumDaConta() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta " + this.numDaConta + ": R$" + this.saldo);
    }
}
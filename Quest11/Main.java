package Quest11;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", 1000.0, "João da Silva");
        ContaCorrente conta2 = new ContaCorrente("67890", 500.0, "Maria Souza");
        ContaCorrente conta3 = new ContaCorrente("11122", 2000.0, "Carlos Pereira");

        System.out.println("--- Saldo Inicial ---");
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        System.out.println("\n--- Depósitos ---");
        conta1.depositar(500.0);
        conta2.depositar(200.0);
        conta3.depositar(1000.0);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        System.out.println("\n--- Saques ---");
        conta1.sacar(200.0);
        conta2.sacar(600.0);
        conta3.sacar(1500.0);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        System.out.println("\n--- Transferências ---");
        conta1.transferir(conta2, 300.0);
        conta3.transferir(conta1, 1000.0);
        conta2.transferir(conta3, 800.0);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        System.out.println("\n--- Tentativa de Depósito Negativo ---");
        conta1.depositar(-100.0);
        conta1.exibirSaldo();

        System.out.println("\n--- Tentativa de Saque Negativo ---");
        conta2.sacar(-50.0);
        conta2.exibirSaldo();

        System.out.println("\n--- Tentativa de Transferência Negativa ---");
        conta3.transferir(conta1, -200.0);
        conta3.exibirSaldo();
        conta1.exibirSaldo();

        try {
            conta1.setSaldo(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o saldo: " + e.getMessage());
        }

        conta1.exibirSaldo();
    }
}
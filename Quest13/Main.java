package Quest13;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica contato1 = new AgendaTelefonica("João Silva", "9999-9999", "joao@email.com");
        AgendaTelefonica contato2 = new AgendaTelefonica("Maria Souza", "8888-8888", "maria@email.com");
        AgendaTelefonica contato3 = new AgendaTelefonica("Carlos Pereira", "7777-7777", "carlos@email.com");

        System.out.println("--- Informações Iniciais ---");
        contato1.exibirContato();
        contato2.exibirContato();
        contato3.exibirContato();

        System.out.println("\n--- Alteração de Telefones ---");
        contato1.alterarTelefone("9888-8888");
        contato2.alterarTelefone("8777-7777");
        contato3.alterarTelefone("7666-6666");
        contato1.exibirContato();
        contato2.exibirContato();
        contato3.exibirContato();

        System.out.println("\n--- Alteração de Emails ---");
        contato1.alterarEmail("joao.novo@email.com");
        contato2.alterarEmail("maria.nova@email.com");
        contato3.alterarEmail("carlos.novo@email.com");
        contato1.exibirContato();
        contato2.exibirContato();
        contato3.exibirContato();
    }
}
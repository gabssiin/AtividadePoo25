package Quest4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João Silva", "Vendas", 3000.00);
        Funcionario funcionario2 = new Funcionario("Maria Oliveira", "Marketing", 3500.00);
        Funcionario funcionario3 = new Funcionario("Carlos Pereira", "TI", 4000.00);

        System.out.println("Exibindo detalhes dos funcionários:");
        funcionario1.exibirFuncio();
        funcionario2.exibirFuncio();
        funcionario3.exibirFuncio();

        System.out.println("Uso de get:");
        System.out.println("Salário de " + funcionario1.getNomeFuncio() + ": " + funcionario1.getSalarioFuncio());

        System.out.println("Uso de set:");
        funcionario2.setSalarioFuncio(3800.00);
        System.out.println("Novo salário de " + funcionario2.getNomeFuncio() + ": " + funcionario2.getSalarioFuncio());

        try {
            funcionario3.setSalarioFuncio(-1000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o salário: " + e.getMessage());
        }

        funcionario3.exibirFuncio();
    }
}
package Quest6;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC1234", "Volkswagen", 2020);
        Veiculo veiculo2 = new Veiculo("DEF5678", "Ford", 2018);
        Veiculo veiculo3 = new Veiculo("GHI9012", "Fiat", 2022);

        System.out.println("------------------------");
        System.out.println("Dados dos veículos registrados:");
        veiculo1.exibirDados();
        System.out.println(" ");
        veiculo2.exibirDados();
        System.out.println(" ");
        veiculo3.exibirDados();

        System.out.println(" ----------------------------");
        System.out.println("A marca do veículo 1 é: " + veiculo1.getMarca());
        System.out.println(" -----------------------");
        System.out.println(" ");

        veiculo2.setAno(2019);
        veiculo1.setPlaca("DOA0284");
        veiculo3.setPlaca("PES081");

        System.out.println(" ---------------------  ");
        System.out.println("Dados dos veículos registrados após alterações: ");
        veiculo1.exibirDados();
        veiculo2.exibirDados();
        veiculo3.exibirDados();

        try {
            veiculo3.setAno(2025);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o ano: " + e.getMessage());
        }

        veiculo3.exibirDados();
    }
}
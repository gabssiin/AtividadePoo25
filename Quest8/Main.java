package Quest8;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Conferência de Tecnologia", "2023-12-15", "Centro de Convenções");
        Evento evento2 = new Evento("Show de Rock", "2024-01-20", "Estádio Municipal");
        Evento evento3 = new Evento("Feira de Artesanato", "2024-02-10", "Parque da Cidade");

        System.out.println(" ------------------- ");
        System.out.println("Informações dos eventos:");
        evento1.exibirInformacoes();
        System.out.println(" ");
        evento2.exibirInformacoes();
        System.out.println(" ");
        evento3.exibirInformacoes();
        System.out.println(" ");

        System.out.println(" ------------------- ");
        System.out.println("Uso de get");
        System.out.println("O local do evento 1 é: " + evento1.getLocal());
        System.out.println("------------------- ");
        System.out.println("Uso de set: ");
        evento3.setData("2024-02-11");
        evento1.setLocal("Dona Lindu");
        evento2.setNomeEvento("Show de Pagode");

        System.out.println("Informações dos eventos (após alteração):");
        System.out.println(" ");
        evento1.exibirInformacoes();
        System.out.println(" ");
        evento2.exibirInformacoes();
        System.out.println(" ");
        evento3.exibirInformacoes();

        try {
            evento1.setLocal("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o local: " + e.getMessage());
        }

        evento1.exibirInformacoes();
    }
}
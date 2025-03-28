package Quest20;

public class Main {
    public static void main(String[] args) {
        SistemaDeReservaDeVoos reserva1 = new SistemaDeReservaDeVoos("AA123", "João Silva", "Econômica");
        SistemaDeReservaDeVoos reserva2 = new SistemaDeReservaDeVoos("BB456", "Maria Souza", "Executiva");
        SistemaDeReservaDeVoos reserva3 = new SistemaDeReservaDeVoos("CC789", "Carlos Pereira", "Primeira Classe");

        System.out.println("--- Reservas Iniciais ---");
        reserva1.exibirDetalhes();
        reserva2.exibirDetalhes();
        reserva3.exibirDetalhes();

        System.out.println("\n--- Confirmando Reservas ---");
        reserva1.confirmarReserva();
        reserva2.confirmarReserva();
        reserva3.confirmarReserva();
        reserva1.exibirDetalhes();
        reserva2.exibirDetalhes();
        reserva3.exibirDetalhes();

        System.out.println("\n--- Alterando Classes ---");
        reserva1.alterarClasse("Executiva");
        reserva2.alterarClasse("Econômica");
        reserva3.alterarClasse("Executiva");
        reserva1.exibirDetalhes();
        reserva2.exibirDetalhes();
        reserva3.exibirDetalhes();

        System.out.println("\n--- Cancelando Reservas ---");
        reserva1.cancelarReserva();
        reserva1.exibirDetalhes();
    }
}
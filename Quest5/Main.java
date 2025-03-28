package Quest5;

/* Questão 05
Sistema de Reservas de Hotel: Um hotel quer um sistema simples para gerenciar reservas. Elabore uma classe Reserva que contenha o nome do hóspede, o tipo de quarto (simples, duplo, suíte) e o número de noites. Crie três reservas diferentes e exiba as informações.
*/
public class Main {
    public static void main(String[] args) {
    Reserva reserva1 = new Reserva("Tainá Santana", "Suíte", 7);
    Reserva reserva2 = new Reserva("Carlos Henrique", "Simples ", 4);
    Reserva reserva3 = new Reserva("Paulo Eduardo", "Duplo", 10);
        System.out.println("-------------------");
        System.out.println("Informações: ");
        reserva1.exibirInformacoes();
        System.out.println(" ");
        reserva2.exibirInformacoes();
        System.out.println(" ");
        reserva3.exibirInformacoes();
        System.out.println(" ");
        System.out.println("-------------------------");
    
    
        System.out.println("Uso de get");
    
        System.out.println("A reserva N° 1 é de: "+ reserva1.getNomeHosp()+ " em: " + reserva1.getNumNoites()+ " noites.");
        System.out.println(reserva3.getNomeHosp()+ " está no quarto: "+ reserva3.getTipoQuarto());
    
    
        System.out.println("--------------");
        System.out.println("Uso de set");
        reserva2.setNumNoites(12);
        reserva1.setNomeHosp("Pedro Almeida");
        reserva3.setTipoQuarto("Suíte");
    
        System.out.println("--------------");
        System.out.println("Informações atualizadas: ");
        reserva1.exibirInformacoes();
        System.out.println(" ");
        reserva2.exibirInformacoes();
        System.out.println(" ");
        reserva3.exibirInformacoes();
        System.out.println(" ");
    
    
        }
    }

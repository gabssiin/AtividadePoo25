package Quest9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Carlos Silva", 35, "Gripe");
        Paciente paciente2 = new Paciente("Ana Souza", 62, "Hipertensão");
        Paciente paciente3 = new Paciente("Pedro Oliveira", 28, "Fratura no braço");

        System.out.println("Informações dos pacientes:");
        paciente1.exibirPaciente();
        paciente2.exibirPaciente();
        paciente3.exibirPaciente();

        System.out.println("Nome do paciente 1: " + paciente1.getNomePac());
        System.out.println("Idade do paciente 2: " + paciente2.getIdadePac());
        System.out.println("Diagnóstico do paciente 3: " + paciente3.getDiag());

        paciente1.setDiag("Recuperado da gripe");
        paciente2.setIdadePac(63);
        paciente3.setNomePac("Pedro Oliveira Júnior");

        System.out.println("\nInformações dos pacientes após as alterações:");
        paciente1.exibirPaciente();
        paciente2.exibirPaciente();
        paciente3.exibirPaciente();

        try {
            paciente1.setIdadePac(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a idade: " + e.getMessage());
        }

        paciente1.exibirPaciente();
    }
}
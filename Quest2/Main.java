package Quest2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel Willian", 7, 4);
        Aluno aluno2 = new Aluno("Tainá Santana", 8, 5);
        Aluno aluno3 = new Aluno("Rafael Santos", 10, 7);

        System.out.println("Exibindo as informações: ");
        aluno1.exibirAlunos();
        System.out.println(" ");
        aluno2.exibirAlunos();
        System.out.println(" ");
        aluno3.exibirAlunos();

        System.out.println("Usos de Get ");
        System.out.println("O nome do aluno(a)2: " + aluno2.getNome());
        System.out.println("O Aluno 3: " + aluno3.getNome() + " está na: " + aluno3.getSerie() + "Série");
        System.out.println(" ");

        System.out.println("Usos de Set");
        aluno2.setSerie(6);
        System.out.println("Aluno(a): " + aluno2.getNome() + " está agora na: " + aluno2.getSerie() + " Série");

        try {
            aluno1.setSerie(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir a série: " + e.getMessage());
        }

        aluno1.exibirAlunos();
    }
}
package Quest7;

public class Main {
    public static void main(String[] args) {
        PerfilUsuario usuario1 = new PerfilUsuario("AnaSilvsA", "Apaixonada por livros e viagens.", 1200);
        PerfilUsuario usuario2 = new PerfilUsuario("JoaoMaster", "Desenvolvedor de software e entusiasta de tecnologia.", 500);
        PerfilUsuario usuario3 = new PerfilUsuario("MariaFulô", "Fotógrafa amadora e amante da natureza.", 2500);

        System.out.println("-------------------------");
        System.out.println("Detalhes dos perfis de usuário:");
        System.out.println(" ");
        usuario1.exibirDetalhes();
        System.out.println(" ");
        usuario2.exibirDetalhes();
        System.out.println(" ");
        usuario3.exibirDetalhes();
        System.out.println(" ");

        System.out.println("-------------------------");
        System.out.println("Uso de get: ");
        System.out.println("Nome de usuário do primeiro perfil: " + usuario1.getNomeUsuario());
        System.out.println("-------------------------");
        System.out.println("Uso de set");
        usuario1.setNumeroSeguidores(333);
        usuario2.setNumeroSeguidores(550);
        usuario3.setNomeUsuario("Maria Flor");

        System.out.println("-------------------------");
        System.out.println("Detalhes dos perfis de usuário atualizados:");
        System.out.println(" ");
        usuario1.exibirDetalhes();
        System.out.println(" ");
        usuario2.exibirDetalhes();
        System.out.println(" ");
        usuario3.exibirDetalhes();
        System.out.println(" ");

        try {
            usuario1.setNumeroSeguidores(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir o número de seguidores: " + e.getMessage());
        }

        usuario1.exibirDetalhes();
    }
}
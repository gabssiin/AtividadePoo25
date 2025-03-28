package Quest4;

public class Funcionario {
    private String nomeFuncio;
    private String departFuncio;
    private double salarioFuncio;

    public Funcionario() {
    }

    public Funcionario(String nomeFuncio, String departFuncio, double salarioFuncio) {
        this.nomeFuncio = nomeFuncio;
        this.departFuncio = departFuncio;
        this.salarioFuncio = salarioFuncio;
    }

    public Funcionario(String nomeFuncio, String departFuncio) {
        this.nomeFuncio = nomeFuncio;
        this.departFuncio = departFuncio;
    }

    public String getNomeFuncio() {
        return nomeFuncio;
    }

    public String getDepartFuncio() {
        return departFuncio;
    }

    public double getSalarioFuncio() {
        return salarioFuncio;
    }

    public void setNomeFuncio(String nomeFuncio) {
        this.nomeFuncio = nomeFuncio;
    }

    public void setDepartFuncio(String departFuncio) {
        this.departFuncio = departFuncio;
    }

    public void setSalarioFuncio(double salarioFuncio) {
        if (salarioFuncio < 0) {
            throw new IllegalArgumentException("Salário inválido: " + salarioFuncio);
        }
        this.salarioFuncio = salarioFuncio;
    }

    public void exibirFuncio() {
        System.out.println("--------------");
        System.out.println("Nome do Funcionário: " + nomeFuncio);
        System.out.println(" ");
        System.out.println("Departamento do Funcionário: " + departFuncio);
        System.out.println(" ");
        System.out.println("Salário do Funcionário: " + salarioFuncio);
        System.out.println(" ");
    }
}
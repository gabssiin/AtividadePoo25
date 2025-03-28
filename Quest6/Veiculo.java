package Quest6;

public class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        if (ano <= 0 || ano > 2023) {
            throw new IllegalArgumentException("Ano inválido: " + ano);
        }
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("----------------------");
    }
}
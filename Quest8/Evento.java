package Quest8;

public class Evento {
    private String nomeEvento;
    private String data;
    private String local;

    public Evento() {
    }

    public Evento(String nomeEvento, String data, String local) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.local = local;
    }

    public Evento(String nomeEvento, String data) {
        this.nomeEvento = nomeEvento;
        this.data = data;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocal(String local) {
        if (local == null || local.isEmpty()) {
            throw new IllegalArgumentException("Local inválido: " + local);
        }
        this.local = local;
    }

    public void exibirInformacoes() {
        System.out.println("-------------------");
        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
        System.out.println("-------------------");
    }
}
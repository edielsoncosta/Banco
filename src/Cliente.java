public class Cliente extends Banco{
    protected String nome;
    protected String cpf;
    protected String id;

    public Cliente(Double saldo, String nome, String cpf, String id) {
        super(saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "nome: "
                + nome
                + "\ncpf: "
                + cpf
                + "\nid: "
                + id;
    }
}

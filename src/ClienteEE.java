public class ClienteEE extends Banco{

    private String cnpj;

    public ClienteEE(Double saldo, String cnpj) {
        super(saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    // sobreposição do saque da classe super, taxa de 5R$ para clientes empresariais

    @Override
    public Double saque(Double saque) {
        return saldo -= saque + 5.0;
    }

    @Override
    public Double deposito(Double deposito) {
        return saldo += deposito - 5.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + " - cnpj (" + cnpj + ")";
    }
}

public class ClienteEE extends Banco{

    private String cnpj;

    public ClienteEE(Double saldo, Double deposito, Double saque, String cnpj) {
        super(saldo, deposito, saque);
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
}

public class ClienteEE extends Banco{

    private final String cnpj;

    public ClienteEE(Double saldo, String cnpj) {
        super(saldo);
        this.saldo = saldo;
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

    // deposito com taxa de 5 reais

    @Override
    public Double deposito(Double deposito) {
        return saldo += deposito - 5.0;
    }

    // override para sobrepor o Banco
    @Override
    public String toString() {

        return "saldo da empresa: R$"
                + String.format("%.2f", saldo)
                + "\ncnpj: " + cnpj;
    }
}

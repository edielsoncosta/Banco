public class Banco{
    protected Double deposito;
    protected Double saque;
    protected Double saldo;

    public Banco(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public Double getSaque() {
        return saque;
    }

    // saque sem taxa para clientes cpf

    public Double saque(Double saque) {
        return saldo -= saque;
    }

    // deposito sem taxa para clientes cpf

    public Double deposito(Double deposito) {
        return saldo += deposito;
    }

    public String printDetails() {
        return "\nSaldo atual: R$"+ String.format("%.2f", saldo);
    }
}

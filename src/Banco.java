public class Banco{
    protected Double saldo;
    protected Double deposito;
    protected Double saque;

    public Banco(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public Double getSaque() {
        return saque;
    }

    public Double saque(Double saque) {
        return saldo -= saque;
    }

    public Double deposito(Double deposito) {
        return saldo += deposito;
    }
}

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto)
            throws SaldoInsuficienteException {

        saldo -= monto;

        if (saldo < 0) {
            throw new SaldoInsuficienteException();
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
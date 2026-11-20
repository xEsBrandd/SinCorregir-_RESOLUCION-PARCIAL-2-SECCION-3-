public class CuentaConComision extends Cuenta {

    public CuentaConComision(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto)
            throws SaldoInsuficienteException {

        super.retirar(monto);
        super.retirar(5);
    }
}
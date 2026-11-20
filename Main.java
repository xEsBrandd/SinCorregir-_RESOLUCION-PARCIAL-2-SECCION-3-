public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new CuentaConComision(30);

        try {
            cuenta.retirar(28);
            System.out.println("Aceptado");

        } catch (SaldoInsuficienteException e) {
            System.out.println("Rechazado");

        } finally {
            System.out.println("Saldo: " + cuenta.getSaldo());
        }
    }
}
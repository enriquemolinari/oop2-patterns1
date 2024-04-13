package template1;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(float saldo) {
        super(saldo);
    }

    @Override
    public void extraer(float saldoARetirar) {
        saldo -= saldoARetirar;
    }
}

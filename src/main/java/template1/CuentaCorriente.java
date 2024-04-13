package template1;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(float saldo) {
        super(saldo);
    }

    @Override
    boolean puedoExtraer(float saldoARetirar) {
        return true;
    }
}

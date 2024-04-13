package template1;

public class CajaDeAhorro extends CuentaBancaria {
    public CajaDeAhorro(float saldo) {
        super(saldo);
    }
    
    @Override
    public void extraer(float saldoARetirar) {
        if (this.saldo >= saldoARetirar) {
            saldo -= saldoARetirar;
        }
    }
}

package template1;

public class Main {
    public static void main(String[] args) {
        var cc = new CuentaCorriente(1000f);
        cc.extraer(100f);
        System.out.println(cc.saldo());

        var cAhorro = new CajaDeAhorro(1000f);
        cAhorro.extraer(30);
        System.out.println(cAhorro.saldo());
    }
}
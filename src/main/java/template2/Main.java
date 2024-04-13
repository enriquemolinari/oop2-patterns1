package template2;

public class Main {
    public static void main(String[] args) {

        var eAprendiz = new Aprendiz(50, "aprendiz");
        var eTemporal = new Temporal(80, "temporal", 2);
        var ePermanente = new Permanente(100, "permanente", 3, 2);

        System.out.println(eAprendiz.sueldo(10));
        System.out.println(eTemporal.sueldo(10));
        System.out.println(ePermanente.sueldo(10));
    }
}

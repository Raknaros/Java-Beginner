public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta=new Cuenta();
        Cuenta segundaCuenta=primeraCuenta;
        //System.out.println("Saldo primera cuenta: "+primeraCuenta.saldo);
        //System.out.println("Saldo segunda cuenta: "+segundaCuenta.saldo);
        //System.out.println("Saldo primera cuenta: "+primeraCuenta.saldo);
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }
}

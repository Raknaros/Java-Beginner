public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(300);
    }
}

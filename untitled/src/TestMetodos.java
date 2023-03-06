public class TestMetodos {
    public static void main(String[] args) {
        Cuenta cuentaGiu=new Cuenta();
        cuentaGiu.depositar(100);
        cuentaGiu.retirar(150);


        Cuenta cuentaPilar=new Cuenta();
        cuentaPilar.depositar(500);

        boolean puedeTransferir = cuentaPilar.transferir(200,cuentaGiu);
        if (puedeTransferir){
            System.out.println("Transferencia Exitosa");
        } else {
            System.out.println("No puede transferir");
        }

    }
}

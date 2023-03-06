import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestConditionals {
    public static void main(String[] args) {
        int edad=21;
        int cantidadPersonas=1;
        boolean esPareja=cantidadPersonas>1;
        System.out.println("El valor de la condicion es: "+esPareja);
        if(edad>=18 || esPareja){
            System.out.println("Usted puede entrar");
        } else {
            System.out.println("Usted no puede"+" entrar");
        }
    }
}

import javax.swing.*;
import java.math.BigInteger;

public class operarFactorial {
    public static void main(String[] args) {
        Long resultado=1L;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de "+numero+" es "+ resultado);
    }
}

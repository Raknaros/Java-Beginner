import javax.swing.*;

public class mailVerifier {
    public static void main(String[] args) {
        //Se declaran las variables a verificar
        int arroba=0;
        boolean punto=false;
        //Ventana de ingreso de información
        String mail=JOptionPane.showInputDialog("Introduce tu correo");
        for(int i=0;i<mail.length();i++){
            //Se verifica si algún caracter de alguna posición coindice con el caracter necesario(@ & .)
            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                punto=true;
            }
        }
        //Se confirma la verificación para confirmar que el correo ingresado es correcto
        if(arroba==1&&punto==true){
            System.out.println("Es correcto");
        }
        //Se informa que no es correcto
        else{
            System.out.println("Correo incorrecto");
        }
    }
}

package coleciones;

import java.util.ArrayList;

public class Ejemplo2 {
    public static void main(String[] args) {
        String variable1="Clase1", variable2="Clase2", variable3="Clase3", variable4="Clase4";
        ArrayList<String> listaString=new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable4);
        listaString.add(variable3);
        listaString.add(variable2);
        System.out.println(listaString.size());
        for(int i=0;i< listaString.size();i++){
            System.out.println(listaString.get(i));
        }
        for(String clase:listaString){
            System.out.println(clase);
        }
        listaString.forEach(clase -> {
            System.out.println(clase);
        });
    }
}

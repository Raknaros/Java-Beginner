package coleciones;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        String variable1="Ejemplo1", variable2="Ejemplo2", variable3="Ejemplo3", variable4="Ejemplo4";
        ArrayList<String> lista=new ArrayList<>();
        lista.add(variable1);
        lista.add(variable4);
        lista.add(variable3);
        lista.add(variable2);
        System.out.println(lista.size());
        lista.remove(2);
        lista.set(2,"Ejemplo alterado");
        System.out.println(lista);

    }
}

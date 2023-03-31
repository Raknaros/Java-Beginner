package coleciones;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo3 {
    public static void main(String[] args) {
        String curso1="Geometria", curso2="Fisica", curso3="Quimica", curso4="Historia";
        ArrayList<String> cursos=new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos);
        //Collections.sort(cursos);

        //System.out.println(cursos);
        //Collections.sort(cursos, Collections.reverseOrder());
        //cursos.sort(Comparator.reverseOrder());
        List<String> cursosList=cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);
    }
}

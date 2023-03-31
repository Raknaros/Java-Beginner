package coleciones;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Ejemplo13 {
    //TODO
    public static void main(String[] args) {
        String alumno1="Luis Miguel",
                alumno2="Pedrito Quispe",
                alumno3="Juancito Mamani",
                alumno4="Lalo Cota",
                alumno5="Gustavo Tijon",
                alumno6="Marcela Mendez",
                alumno7="Lalo Cota",
                alumno8="Luis Miguel";
        Collection<String> listaAlumnos=new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        /*for (String alumno:listaAlumnos) {System.out.println(alumno);}
        listaAlumnos.forEach(alumno->{
            System.out.println(alumno);
        });*/
        boolean valida=listaAlumnos.contains("Pedrito Quispe");
        String max=listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        listaAlumnos.removeIf(alumno->"Pedrito qaspe".equalsIgnoreCase(alumno));
        listaAlumnos.forEach(alumno->{
            System.out.println(alumno);
        });

    }
}

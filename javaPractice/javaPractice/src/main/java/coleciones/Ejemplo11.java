package coleciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {
    //TODO
    public static void main(String[] args) {
        String alumno1="Luis Miguel", alumno2="Pedrito Quispe", alumno3="Juancito Mamani", alumno4="Lalo Cota", alumno5="Gustavo Tijon", alumno6="Marcela Mendez";
        Set<String> listaAlumnos=new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        for (String alumno:listaAlumnos) {System.out.println(alumno);}

    }
}

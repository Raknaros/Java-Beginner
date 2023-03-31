package coleciones;

import coleciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Ejemplo14 {
    //TODO
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Luis Miguel","001"),
                alumno2=new Alumno("Jose Manuel","002"),
                alumno3=new Alumno("Alejandro Sanz","003"),
                alumno4=new Alumno("Tiziano Ferro","004"),
                alumno5=new Alumno("Eros Ramazoti","005"),
                alumno6=new Alumno("Pedro Suarez","006"),
                alumno7=new Alumno("Chibolin","007");


        Collection<Alumno> listaAlumnos=new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);

        Alumno alumno8=new Alumno("Luis Miguel","001");
        //listaAlumnos.add(alumno8);
        System.out.println(alumno1.equals(alumno8));
        System.out.println(listaAlumnos.contains(alumno8));

    }
}

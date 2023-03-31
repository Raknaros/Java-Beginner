package coleciones;

import coleciones.modelo.Alumno;
import coleciones.modelo.Curso;

import java.util.Collection;
import java.util.HashSet;

public class Ejemplo15 {
    //TODO
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Luis Miguel","001"),
                alumno2=new Alumno("Jose Manuel","002"),
                alumno3=new Alumno("Alejandro Sanz","003"),
                alumno4=new Alumno("Tiziano Ferro","004"),
                alumno5=new Alumno("Eros Ramazoti","005"),
                alumno6=new Alumno("Pedro Suarez","006"),
                alumno7=new Alumno("Chibolin","007");
        Curso curso1=new Curso("PHP",30),
                curso2=new Curso("Python",10),
                curso3=new Curso("C++",20),
                curso4=new Curso("Java",50),
                curso5=new Curso("Ruby",50),
                curso6=new Curso("Java",50),
                curso7=new Curso("C++",50),
                curso8=new Curso("R",50);

        Collection<Alumno> listaAlumnos=new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        Alumno alumno8=new Alumno("Luis Miguel","001");
        //listaAlumnos.add(alumno8);
        System.out.println(alumno1.equals(alumno8));
        System.out.println(curso1.verificaAlumno(alumno8));

    }
}

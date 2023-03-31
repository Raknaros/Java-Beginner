package coleciones;

import coleciones.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo9 {
    public static void main(String[] args) {
        Curso curso1=new Curso("PHP",30),
                curso2=new Curso("Python",10),
                curso3=new Curso("C++",20),
                curso4=new Curso("JavaScript",50);
        ArrayList<Curso> cursos=new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        //System.out.println(cursos);
        //cursos.sort(Comparator.comparing(Curso::getNombre));
        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        int mayor = 0;
        for(Curso curso: cursos){
            if(curso.getTiempo()>mayor){
                mayor=curso.getTiempo();
            }
        }
        System.out.println(mayor);

        //List<Curso> cursosList=cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Python")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Python")).mapToInt(Curso::getTiempo).sum());

    }

}

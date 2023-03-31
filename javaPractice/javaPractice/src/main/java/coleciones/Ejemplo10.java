package coleciones;

import coleciones.modelo.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo10 {
    public static void main(String[] args) {
        Curso curso1=new Curso("PHP",30),
                curso2=new Curso("Python",10),
                curso3=new Curso("C++",20),
                curso4=new Curso("Java",50),
                curso5=new Curso("Ruby",50),
                curso6=new Curso("Java",50),
                curso7=new Curso("C++",50),
                curso8=new Curso("R",50);

        ArrayList<Curso> cursos=new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);
        //System.out.println(cursos);
        //cursos.sort(Comparator.comparing(Curso::getNombre));
        //Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        //List<Curso> cursosList=cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Python")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Python")).mapToInt(Curso::getTiempo).sum());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        Map<String, List<Curso>> groupCurso=cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCurso.forEach((key,value)-> System.out.println(key+" - "+value.size()));
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

    }

}

package coleciones;

import java.util.ArrayList;

import coleciones.modelo.Curso;

public class Ejemplo4 {
    public static void main(String[] args) {
        Curso curso1=new Curso("Geometria",30),
                curso2=new Curso("Historia",10),
                curso3=new Curso("Quimica",20),
                curso4=new Curso("Fisica",50);
        ArrayList<Curso> cursos=new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos);
    }
}

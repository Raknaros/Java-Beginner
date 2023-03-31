package coleciones;

import coleciones.modelo.Aula;
import coleciones.modelo.Curso;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo7 {
    public static void main(String[] args) {
        Curso curso1=new Curso("Java",30);
        curso1.addAula(new Aula("Arraylist"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        curso1.addAula(new Aula("OtraList"));
        curso1.addAula(new Aula("Inmutable"));
        List<Aula> aulaList=curso1.getAulaList();
        //aulaList.add(new Aula("Inmutable"));
        ArrayList<Curso> cursos=new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());

    }
}

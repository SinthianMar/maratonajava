package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sinthian";
        estudante01.idade = 23;
        estudante01.sexo = 'F';

        estudante02.nome = "Silvana";
        estudante02.idade = 53;
        estudante02.sexo = 'F';

        System.out.println( estudante01.nome);
        System.out.println( estudante01.idade);
        System.out.println( estudante01.sexo);

        System.out.println("-----------------");

        System.out.println( estudante02.nome);
        System.out.println( estudante02.idade);
        System.out.println( estudante02.sexo);
    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import javax.sound.midi.Soundbank;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salarios: salarios){
            System.out.println(salarios + " ");
        }
    }
    public void imprimeMediaSalarial(){
        double media = 0;
        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);

    }
}

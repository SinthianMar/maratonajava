package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 3) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while" + ++count);
        } while (count < 3);

        for (count= 0; count < 3; count++) {
            System.out.println("For " +count);
        }
    }
}

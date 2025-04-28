package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição2 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 a 1000000
        for (int i = 0; i < 1000000 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);

            }
        }
    }
}

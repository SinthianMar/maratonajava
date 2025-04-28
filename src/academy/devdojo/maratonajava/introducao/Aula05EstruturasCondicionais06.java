package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // dado os valores de 1 a 7 imprima se é dia util ou final de semana

        Byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da Semana");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

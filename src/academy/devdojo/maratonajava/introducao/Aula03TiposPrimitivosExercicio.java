package academy.devdojo.maratonajava.introducao;

/*
Prática
crie variáveis pra os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario> na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Maria";
        String endereco = "Av florianopolis";
        int idade = 20;
        int numero = 108;
        double salario = 1500.00;
        long data = 2024;
        System.out.println("Eu " + nome);
        System.out.println("Moro no endereço " + endereco + " nº " + numero);
        System.out.println("tenho: " + idade+ " anos");
        System.out.println("Confirmo que recebi " + salario+ " em " + data);

        /* Para data podemos usar String EX: String dataDeRecebimentoDeSalario = "10/10/2024";
         Para a mensagem podemos usar String também e no nome dela imprimimos na tela */
    }
}


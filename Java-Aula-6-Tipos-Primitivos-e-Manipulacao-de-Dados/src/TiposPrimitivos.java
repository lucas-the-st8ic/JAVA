import java.util.Scanner;

public class TiposPrimitivos {

    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
            Tipos primitivos e Manipulação de Dados


         */

        //Números Inteiros, tipos de declaração
        byte by = 127;
        short shr = 32767;
        int i = 2147483;
        long l = 2147483647L;

        int idade = 3;
        int idade01 = (int) 3;
        Integer idade02 = new Integer(3);

        //Números reais, tipos de declaração

        float fl = 3.4e+38F;
        double dbl = 3.1415;

        float salario = 1825.54f;
        float salario01 = (float) 1825.54;
        Float salario02 = new Float(1825.54);

        //Caracteres, tipos de declaração
        char opcao1 = (char) 'A';
        Character opcao2 = new Character((char) 'A');

        //Booleans, tipos de declaração
        boolean casado = false;
        Boolean casado01 = new Boolean(false);
        //==============================================================================================================

        float nota = 8.5F;
        System.out.println("Nota: " + nota);

        System.out.printf("Sua nota é %.2f\n", nota);

        String nome;

        System.out.print("Qual seu nome? ");
        nome = input.nextLine();

    }
}

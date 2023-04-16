package lacosDeRepeticao._For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class For_part02_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("TABUADA MULTIPLICAÇÃO");
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }

        scan.close();
    }
}

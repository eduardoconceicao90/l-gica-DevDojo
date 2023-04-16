package lacosDeRepeticao._While;

import java.util.Scanner;

public class While_part05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int desejaContinuar = 1;

        do {
            System.out.print("PLAYER 1 -> Digite um numero de 1 a 10: ");
            int numero1 = scan.nextInt();

            System.out.print("PLAYER 2 -> Digite um numero de 1 a 10: ");
            int numero2 = scan.nextInt();

            System.out.println("Acertou: " + (numero1 == numero2));
            System.out.println("--------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = scan.nextInt();

        } while (desejaContinuar == 1);

        scan.close();
    }
}

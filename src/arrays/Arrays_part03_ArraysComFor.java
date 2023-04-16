package arrays;

import java.util.Scanner;

public class Arrays_part03_ArraysComFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: " + (i+1));
            notas[i] = scan.nextDouble();
        }

        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Notas: " + (i + 1) + ": " + notas[i]);
        }

        media = media / notas.length;
        System.out.println("Media das notas: " + media);

    }
}

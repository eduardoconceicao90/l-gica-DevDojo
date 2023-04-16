package lacosDeRepeticao._While;

import java.util.Scanner;

public class While_part02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        int i = 0;

        while (i <= numero){
            if(i % 2 == 1){
                System.out.println("Numeros impares: " + i);
            }
            i++;
        }

        scan.close();
    }
}

package lacosDeRepeticao._While;

import java.util.Scanner;

public class While_part03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3){
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");

            System.out.print("Digite a sua opção: ");
            opcao = scan.nextInt();

        }
        System.out.println("Programa finalizado");
        scan.close();
    }
}

package variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Nome digitado: " + nome);
        System.out.println("Idade digitada: " + idade);

        scan.close();
    }
}

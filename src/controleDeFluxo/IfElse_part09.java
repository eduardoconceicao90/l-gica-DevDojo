package controleDeFluxo;

import java.util.Scanner;

public class IfElse_part08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scan.nextInt();

        if (idade <= 10) {
            System.out.println("Nome: " + nome + ", Categoria Infantil");
        } else if (idade > 10 && idade <= 15) {
            System.out.println("Nome: " + nome + ", Categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Nome: " + nome + ", Categoria Pré-adulto");
        } else {
            System.out.println("Nome: " + nome + ", Categoria Adulto");
        }

        scan.close();
    }
}

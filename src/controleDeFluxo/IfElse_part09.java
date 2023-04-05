package controleDeFluxo;

import java.util.Scanner;

public class IfElse_part09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*** CADASTRAMENTO ***");
        System.out.print("Digite o nome: ");
        String nome = scan.nextLine();

        if (nome.isEmpty() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) { // Compara as String independente do Case-sensitive.
            System.out.println("Usuário inválido!");
        } else {
            System.out.println(nome + " cadastrado com sucesso!");
        }

        scan.close();
    }
}

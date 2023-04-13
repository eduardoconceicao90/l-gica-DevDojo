package estruturasCondicionais.switchCase;

import java.util.Scanner;

public class swicthCase_part02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tipo da conta: ");
        String conta = scan.nextLine();

        switch (conta){
            case "CONTA_POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("Conta inválida");
        }

        scan.close();
    }
}

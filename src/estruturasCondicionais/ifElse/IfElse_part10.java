package estruturasCondicionais.ifElse;

import java.util.Scanner;

public class IfElse_part10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*** ALISTAMENTO ***");

        System.out.print("Digite o sexo: ");
        String sexo = scan.next();

        System.out.print("Digite a idade: ");
        Integer idade = scan.nextInt();

        if (sexo.equals("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório!");
        } else if (sexo.equals("F") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else if ((sexo.equals("M") || sexo.equals("F")) && idade < 18) {
            System.out.println("Alistamento não permitido!");
        }

        scan.close();
    }
}

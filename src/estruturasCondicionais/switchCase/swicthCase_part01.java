package estruturasCondicionais.switchCase;

import java.util.Scanner;

public class swicthCase_part01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** DIAS DA SEMANA ***");

        System.out.print("Digite o dia: ");
        int dia = scan.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
        System.out.println("Fim do programa");
        scan.close();
    }
}

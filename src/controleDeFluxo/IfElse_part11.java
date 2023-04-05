package controleDeFluxo;

import java.util.Scanner;

public class IfElse_part11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("*** DIAS DA SEMANA ***");

        System.out.print("Digite o dia: ");
        int dia = scan.nextInt();

        if(dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2){
            System.out.println("Segunda-feira");
        } else if (dia == 3){
            System.out.println("Terça-feira");
        } else if (dia == 4){
            System.out.println("Quarta-feira");
        } else if (dia == 5){
            System.out.println("Quinta-feira");
        } else if (dia == 6){
            System.out.println("Sexta-feira");
        } else if (dia == 7){
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido!");
        }

        scan.close();
    }
}

package lacosDeRepeticao._While;

import java.util.Scanner;

public class While_part04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String login = "Eduardo";
        final String password = "123";

        while (true){
            System.out.print("Digite seu login: ");
            String loginDigitado = scan.nextLine();
            System.out.print("Digite sua senha: ");
            String passwordDigitado = scan.nextLine();

            if(login.equals(loginDigitado) && password.equals(passwordDigitado)){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        scan.close();
    }
}

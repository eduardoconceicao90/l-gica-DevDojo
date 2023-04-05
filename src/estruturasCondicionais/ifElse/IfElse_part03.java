package estruturasCondicionais.ifElse;

public class IfElse_part03 {
    public static void main(String[] args) {
        double salario = 4700.50;
        double porcentagem;
        double resultado;

        if (salario > 4500) {
            porcentagem = 30;
            resultado = salario * (porcentagem / 100);
            System.out.println(porcentagem + "% = " + resultado);
        } else {
            porcentagem = 15;
            resultado = salario * (porcentagem / 100);
            System.out.println(porcentagem + "% = " + resultado);
        }
    }
}

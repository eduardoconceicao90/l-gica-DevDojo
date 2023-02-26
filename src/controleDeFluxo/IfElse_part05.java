package controleDeFluxo;

public class IfElse_part05 {
    public static void main(String[] args) {
        // Imposto de Renda...

        double salario = 1050;

        if (salario <= 1903.98) {
            System.out.println("Isento");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7,5% = " + salario * 0.075);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("15% = " + salario * 0.15);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22.5% = " + salario * 0.225);
        } else {
            System.out.println("27.5% = " + salario * 0.275);
        }
    }
}

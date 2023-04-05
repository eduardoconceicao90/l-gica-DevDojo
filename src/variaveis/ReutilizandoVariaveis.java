package variaveis;

public class ReutilizandoVariaveis {

    public static void main(String[] args) {
        double salario = 5000;
        double porcentagem1 = 30;
        double porcentagem2 = 15;
        double porcentagem3 = 5;
        double resultado = salario * (porcentagem1 / 100);

        System.out.println(porcentagem1 + "% de " + "R$ " + salario + " é igual a: " + "R$ " + resultado);

        resultado = salario * (porcentagem2 / 100);

        System.out.println(porcentagem2 + "% de " + "R$ " + salario + " é igual a: " + "R$ " + resultado);

        resultado = salario * (porcentagem3 / 100);

        System.out.println(porcentagem3 + "% de " + "R$ " + salario + " é igual a: " + "R$ " + resultado);
    }
}

package variaveis;

public class PorcentagemSalario {

    public static void main(String[] args) {
        double salario = 2450.30;
        double porcentagem = 21;
        double resultado = salario * (porcentagem / 100);

        System.out.println(porcentagem + "% de " + "R$ " + salario + " é igual a: " + "R$ " + resultado);
    }
}

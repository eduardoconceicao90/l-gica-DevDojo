package estruturasCondicionais;

public class OperadorTernario {

    public static void main(String[] args) {

        // Doar se salario > 5000
        double salario = 3000;
        String msgDoar = "Eu vou doar 500";
        String msgNaoDoar = "Não tenho condições de doar no momento";

        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}

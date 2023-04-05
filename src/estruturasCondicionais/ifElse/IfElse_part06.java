package estruturasCondicionais.ifElse;

public class IfElse_part06 {
    public static void main(String[] args) {

        String nome = "Eduardo";
        int idade = 16;

        if (idade <= 10) {
            System.out.println("Nome: " + nome + ", Categoria Infantil");
        } else if (idade > 10 && idade <= 15) {
            System.out.println("Nome: " + nome + ", Categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Nome: " + nome + ", Categoria Pré-adulto");
        } else {
            System.out.println("Nome: " + nome + ", Categoria Adulto");
        }
    }
}

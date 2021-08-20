import java.util.Scanner;

public class ComparaString {

    public static void main(String[] args) {
        String senha = "semana2";
        String resposta = "";
        Scanner sc = new Scanner(System.in);

        //pedir senha
        System.out.println("Entre com a senha:");
        resposta = sc.next();

        //compara string
        if(resposta.equalsIgnoreCase(senha))
        {
            System.out.println("Permissão concedida!!");
        }
        else
        {
            System.out.println("Permissão NEGADA!!!");
        }

        sc.close();
    }
}
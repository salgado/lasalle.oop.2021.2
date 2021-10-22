import java.util.InputMismatchException;
import java.util.Scanner;

public class OlaTry {

    public static void main(String[] args) {

        // exemplificar o uso do try/catch

        Integer num1;
        Integer num2;

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Entre com num1:");
            num1 = teclado.nextInt();

            System.out.println("Entre com num2:");
            num2 = teclado.nextInt();

            System.out.println("Soma:" + (num1 + num2));

        } catch (InputMismatchException e) {
            System.out.println("Entre com valor numérico!!");
        } catch (Exception e) {
            System.out.println("Desculpa, algum erro aconteceu!!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminando....");
        }

    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioUm {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Informe o operador (+, -, *, /): ");
        String operador = scanner.next();

        switch (operador) {
            case "+":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case "-":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case "*":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case "/":

                if (numero2 != 0) {
                    System.out.println("Resultado " + (numero1 / numero2));
                } else {
                    System.out.println("Erro! Divisão por zero.");
                }
                break;

            default:
                System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}


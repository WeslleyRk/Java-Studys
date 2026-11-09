import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("Operador: ");
        String operador = sc.next();

        if (operador.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (operador.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (operador.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (operador.equals("/")) {
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Operador invalido");
        }

    }
}

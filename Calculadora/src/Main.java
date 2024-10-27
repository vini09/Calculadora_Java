import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operador;

        while (true) {

            System.out.print("Digite o operador (+, -, /, *): ");
            operador = scanner.next();


            if (operador.equals(".")) {
                break;
            }

            System.out.print("Informe um número: ");
            int num1 = scanner.nextInt();

            System.out.print("Informe o outro número: ");
            int num2 = scanner.nextInt();

            Calculadora calculadora = new Calculadora(num1, num2);

            int resultado;
            switch (operador) {
                case "+":
                    resultado = calculadora.soma();
                    System.out.println("O resultado da soma eh: " + resultado);
                    break;
                case "-":
                    resultado = calculadora.subtracao();
                    System.out.println("O resultado da subtração eh: " + resultado);
                    break;
                case "/":
                    resultado = calculadora.divisao();
                    System.out.println("O resultado da divisão eh: " + resultado);
                    break;
                case "*":
                    resultado = calculadora.multiplicacao();
                    System.out.println("O resultado da multiplicação eh: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido");
            }
        }
        scanner.close();
    }
}
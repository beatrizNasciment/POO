/*
Exercicio 1
Aluna: Fátima Beatriz 
RGM: 30246377
*/


import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        final double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        final double num2 = input.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Raiz Quadrada");

        final int opcao = input.nextInt();

        double resultado = 0.0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                break;
            case 6:
                resultado = Math.sqrt(num1);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}


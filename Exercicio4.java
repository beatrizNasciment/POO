/*
Exercicio 4
Aluna: Fátima Beatriz 
RGM: 30246377
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            double raizCubica = Math.cbrt(num);
            System.out.printf("A raiz cúbica de %d é %.2f\n", num, raizCubica);
        } else {
            double raizQuadrada = Math.sqrt(num);
            System.out.printf("A raiz quadrada de %d é %.2f\n", num, raizQuadrada);
        }

        sc.close();
    }
}

/*
Exercicio 2
Aluna: Fátima Beatriz 
RGM: 30246377
*/


import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        // Conversão para Celsius
        double celsius = temperatura;
        System.out.printf("%.2f graus Celsius\n", celsius);

        // Conversão para Fahrenheit
        double fahrenheit = temperatura * 9/5 + 32;
        System.out.printf("%.2f graus Fahrenheit\n", fahrenheit);

        // Conversão para Kelvin
        double kelvin = temperatura + 273.15;
        System.out.printf("%.2f graus Kelvin\n", kelvin);

        input.close();
    }
}

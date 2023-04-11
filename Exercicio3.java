/*
Exercicio 3
Aluna: Fátima Beatriz 
RGM: 30246377
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        if (sobrenome.equalsIgnoreCase("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equalsIgnoreCase("Kent")) {
            System.out.println("Saí daí, mané!");
        } else if (nome.equalsIgnoreCase("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else {
            System.out.println("Cai fora!");
        }

        input.close();
    }
}

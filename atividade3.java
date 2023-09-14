package Estrutura;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double valorProd1 = scanner.nextDouble();

        System.out.println("Digite o preço do segundo produto: ");
        double valorProd2 = scanner.nextDouble();

        System.out.println("Digite o preço do terceiro produto: ");
        double valorProd3 = scanner.nextDouble();

        scanner.close();

        if (valorProd1 < valorProd2 && valorProd1 < valorProd3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (valorProd2 < valorProd1 && valorProd2 < valorProd3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else if (valorProd3 < valorProd1 && valorProd3 < valorProd2) {
            System.out.println("Você deve comprar o terceiro produto.");
        } else {
            System.out.println("Os valores são iguais escolha outro produto.");

            // Colocaria um while aqui mas não pediu nada sobre então vou entregar assim :D
        }
    }
}

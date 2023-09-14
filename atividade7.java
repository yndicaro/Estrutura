package Estrutura;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NP = 0;
        int NI = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                NP++;
            } else {
                NI++;
            }
        }

        scanner.close();

        System.out.println("Quantidade de números pares: " + NP);
        System.out.println("Quantidade de números ímpares: " + NI);
    }
}

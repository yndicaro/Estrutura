package Estrutura;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] gabarito = new int[5];
        //Aplicação de vetor
        int[] aposta = new int[10];

        // Leitura do gabarito da Loto
        System.out.println("Digite o gabarito da Loto (5 números diferentes):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            gabarito[i] = scanner.nextInt();
        }
        // Leitura da aposta
        System.out.println("Digite sua aposta (10 números):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            aposta[i] = scanner.nextInt();
        }
        scanner.close();

        // Cálculo da pontuação
        int pontos = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (aposta[i] == gabarito[j]) {
                    //comparação dos valores apostados com o gabarito.
                    pontos++;
                }
            }
        }

        System.out.println("Pontuação: " + pontos + " pontos");
    }
}

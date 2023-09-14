package Estrutura;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o turno de estudo (M, V ou N): ");
        char turno = scanner.next().charAt(0);
        scanner.close();

        String resposta;

        switch (turno) {
            case 'M':
            case 'm':
                resposta = "Bom dia";
                break;
            case 'V':
                resposta = "Boa tarde";
                break;
            case 'v':
                resposta = "Boa tarde";
                break;
            case 'N':
                resposta = "Boa noite";
                break;
            case 'n':
                resposta = "Boa noite";
                break;
            default:
                resposta = "Não existe referencia para este turno";
        }

        System.out.println(resposta);
    }
}

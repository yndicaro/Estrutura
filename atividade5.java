package Estrutura;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às perguntas com 'sim' ou 'não'.");
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.next().toLowerCase();

        //toLowerCase para caso a pessoa digite em maiusculo ou minusculo não de erro de case sentive

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.next().toLowerCase();

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.next().toLowerCase();

        System.out.print("Já trabalhou com a vítima? ");
        String resposta4 = scanner.next().toLowerCase();
        scanner.close();

        int suspeita = 0;

        if (resposta1.equals("sim")) {
            //Equals utilizando para saber se o objeto ( Resposta ) é igual a resposta1
            suspeita++;
        }
        if (resposta2.equals("sim")) {
            suspeita++;
        }
        if (resposta3.equals("sim")) {
            suspeita++;
        }
        if (resposta4.equals("sim")) {
            suspeita++;
        }
        String classificacao;
        switch (suspeita) {
            case 2:
                classificacao = "Suspeita";
                break;
            case 3:
            case 4:
                classificacao = "Cúmplice";
                break;
            case 5:
                classificacao = "Assassino";
                break;
            default:
                classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);
    }
}

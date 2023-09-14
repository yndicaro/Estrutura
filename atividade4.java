package Estrutura;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do colaborador: ");
        double salario = scanner.nextDouble();
        scanner.close();

        double aumento;
        if (salario <= 0) {
            System.out.println("O salário deve ser um valor maior que zero.");
        } else {
            System.out.println("Salário antes do aumento: R$ " + salario);

            if (salario <= 1780) {
                aumento = salario * 0.20;
            } else if (salario >= 1781 && salario <= 2700) {
                aumento = salario * 0.15;
            } else if (salario >= 2701 && salario <= 3500) {
                aumento = salario * 0.10;
            } else {
                aumento = salario * 0.05;
            }
            double SAA = salario + aumento;
            //SAA = Salario apos aumento

            System.out.println("Aumento: R$ " + aumento);
            System.out.println("Salário após o aumento: R$ " + SAA);
        }
    }
}
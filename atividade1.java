package Estrutura;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        int num = 4;
        int num2 = 5;
        System.out.println("os valores são: "+num+" e "+ num2);
        System.out.println("a soma é igual a "+num + num2);
        System.out.println("O valor ao quadrado é igual a: "+num * num + " e "+ num2 * num2);
        System.out.println("O valor ao cubo é igual a: "+(num * num)*num + " e "+ (num2 * num2)*num2);

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int Numero = input.nextInt();
        System.out.println("O valor ao quadrado e ao cubo é igual a "+ (Numero * Numero) +" "+ (Numero * Numero)*Numero);

    }
}

package Estrutura;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String NomeUsu = scanner.nextLine();

        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(NomeUsu)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            }
        } while (senha.equals(NomeUsu));

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }
}

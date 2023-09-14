package Estrutura;

public class Trabalho1 {
    private static final String[] filmes = new String[10]; // Matriz para guardar os filmes
    private static int TotalFilmes = 0; // valor pra rastrear o filme na matriz.

    public static void main(String[] args) {
        menu(); // Codigo principal, onde realmente o programa começa.
    }
    public static void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir na última posição");
            System.out.println("2. Inserir em uma posição escolhida");
            System.out.println("3. Pesquisar um filme");
            System.out.println("4. Excluir por elemento");
            System.out.println("5. Excluir por posição");
            System.out.println("6. Imprimir lista de filmes");
            System.out.println("7. Sair");

            int escolha = lerInteiro("Escolha uma opção: "); // Lê o valor digitado pelo usuário

            switch (escolha) { // Case de forma rapida.
                case 1 -> InserirUP(); //Ultima Posição
                case 2 -> InserirPE(); // Posição escolhida
                case 3 -> Pesquisar();
                case 4 -> ExcluirElemento();
                case 5 -> ExcluirPosicao();
                case 6 -> ImprimirLista();
                case 7 -> {
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida. Informe um valor valido..");
            }
        }
    }
    public static void InserirUP() { // Inserir na ultima posição
        if (TotalFilmes < filmes.length) {
            String filme = lerString("Digite o nome do filme: "); // Lê o nome do filme
            filmes[TotalFilmes] = filme; // Insere o filme na última posição da matriz
            TotalFilmes++; // Incrementa o TotalFilmes da lista de filmes
            System.out.println("Filme inserido na última posição.");
        } else {
            System.out.println("A lista de filmes está cheia.");
        }
    }
    public static void InserirPE() { //Inserir por posição escolhida
        int posicao = lerInteiro("Digite a posição para inserir o filme: "); // Lê a posição desejada
        if (posicao >= 0 && posicao <= TotalFilmes) {
            if (TotalFilmes < filmes.length) { // Comparação
                String filme = lerString("Digite o nome do filme: "); // Lê o nome do filme
                for (int i = TotalFilmes; i > posicao; i--) {
                    filmes[i] = filmes[i - 1]; // Desloca os filmes para abrir espaço para o novo filme
                }
                filmes[posicao] = filme; // Insere o filme na posição escolhida
                TotalFilmes++; // Incrementa o TotalFilmes da lista de filmes
                System.out.println("Filme inserido na posição escolhida.");
            } else {
                System.out.println("A lista de filmes está cheia.");
            }
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }
    public static void Pesquisar() {
        String filme = lerString("Digite o nome do filme a ser pesquisado: "); // Lê o nome do filme a ser pesquisado
        for (int i = 0; i < TotalFilmes; i++) {
            if (filmes[i].equalsIgnoreCase(filme)) { // Compara o nome do filme com os filmes na matriz
                System.out.println("O filme foi encontrado na posição " + i + ".");
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }
    public static void ExcluirElemento() {
        String filme = lerString("Digite o nome do filme a ser excluído: "); // Lê o nome do filme a ser excluído
        for (int i = 0; i < TotalFilmes; i++) {
            if (filmes[i].equalsIgnoreCase(filme)) { // Encontra o filme na matriz
                for (int j = i; j < TotalFilmes - 1; j++) {
                    filmes[j] = filmes[j + 1]; // Remove o filme da matriz
                }
                TotalFilmes--; // Decrementa o TotalFilmes da lista de filmes
                System.out.println("Filme excluído.");
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }
    public static void ExcluirPosicao() {
        int posicao = lerInteiro("Digite a posição do filme a ser excluído: "); // Lê a posição do filme a ser excluído
        if (posicao >= 0 && posicao < TotalFilmes) {
            for (int i = posicao; i < TotalFilmes - 1; i++) {
                filmes[i] = filmes[i + 1]; // Remove o filme da matriz
            }
            TotalFilmes--; // Decrementa o TotalFilmes da lista de filmes
            System.out.println("Filme na posição " + posicao + " excluído.");
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }
    public static void ImprimirLista() {
        System.out.println("Lista de Filmes:");
        for (int i = 0; i < TotalFilmes; i++) {
            System.out.println(i + ". " + filmes[i]); // Imprime a lista de filmes com suas posições
        }
    }
    public static int lerInteiro(String Ler) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print(Ler);
            return scanner.nextInt(); // Lê um número inteiro
        } catch (java.util.InputMismatchException e) { //Não foi explicado em aula, mas é uma forma de indicar que ocorreu uma erro quando o codigo tentou
                                                        // ler a entrada de dados
            System.out.println("Entrada inválida. Digite um número inteiro.");
            return lerInteiro(Ler);
        }
    }

    public static String lerString(String Ler) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(Ler);
        return scanner.nextLine(); // Lê uma linha de texto
    }
}

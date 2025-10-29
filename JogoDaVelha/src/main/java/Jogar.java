import java.util.Scanner;

public class Jogar {

    private Jogador j1;
    private Jogador j2;
    private Tabuleiro tabuleiro;
    private Scanner sc;

    public Jogar() {
        sc = new Scanner(System.in);
        tabuleiro = new Tabuleiro();
    }

    public void inciar() {
        int opcao;

        do {
            opcao = menu();

            switch (opcao) {
                case 1 -> {
                    configurarJogadores();
                    jogarPartida();
                }
                case 2 -> reiniciarPartida();
                case 3 -> System.out.println("Finalizado");
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    private int menu() {
        System.out.println(" Jogo da velha ");
        System.out.println("1 - Iniciar novo jogo");
        System.out.println("2 - Reiniciar placar");
        System.out.println("3 - Sair");
        return sc.nextInt();
    }

    private void configurarJogadores() {
        sc.nextLine(); // limpa buffer

        System.out.println("Nome do Jogador 1 (X): ");
        j1 = new Jogador(sc.nextLine(), 'X');

        System.out.println("Nome do Jogador 2 (O): ");
        j2 = new Jogador(sc.nextLine(), 'O');
    }

    private void jogarPartida() {
        boolean continuar = true;

        while (continuar) {
            tabuleiro.limpar();
            realizarRodada();

            System.out.println("\nPlacar: " +
                    j1.getNome() + " (" + j1.getVitorias() + ") X (" + j2.getVitorias() + ") " + j2.getNome());

            System.out.println("Deseja jogar novamente? (s/n)");
            char resposta = sc.next().toLowerCase().charAt(0);

            if (resposta== 's'){
                continuar = true;
            } else {
                System.out.println(" Programa encerrado, obrigado!");
                System.exit(0);
            }
        }
    }

    private void realizarRodada() {
        Jogador jogador = j1;

        while (true) {
            tabuleiro.imprimir();
            System.out.println("Vez do jogador: " + jogador.getNome() + " (" + jogador.getSimbolo() + ")");

            System.out.print("Linha (0-2): ");
            int linha = sc.nextInt();

            System.out.print("Coluna (0-2): ");
            int coluna = sc.nextInt();

            if (tabuleiro.movimentoValido(linha, coluna)) {
                tabuleiro.marcar(linha, coluna, jogador.getSimbolo());

                if (tabuleiro.verificarVitoria(jogador.getSimbolo())) {
                    tabuleiro.imprimir();
                    System.out.println("O(a) jogador(a) " + jogador.getNome() + " venceu!");
                    jogador.adicionarVitoria();
                    break;
                }

                if (tabuleiro.cheio()) {
                    tabuleiro.imprimir();
                    System.out.println("Empate!");
                    break;
                }

                jogador = (jogador == j1) ? j2 : j1;
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }

    private void reiniciarPartida() {
        if (j1 != null && j2 != null) {
            j1.resetVitoria();
            j2.resetVitoria();
            System.out.println(" Placar reiniciado.");
        } else {
            System.out.println("Nenhum jogo iniciado");
        }
    }
}

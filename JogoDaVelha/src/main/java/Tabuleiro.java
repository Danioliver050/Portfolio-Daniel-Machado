public class Tabuleiro {

    private char[][] tabula;

    public Tabuleiro() {
        tabula = new char[3][3];
        limpar();
    }

    public void limpar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabula[i][j] = ' ';
            }
        }
    }

    public boolean movimentoValido(int linha, int coluna) {
        return linha >= 0 && linha <= 2 &&
                coluna >= 0 && coluna <= 2 &&
                tabula[linha][coluna] == ' ';
    }

    public void marcar(int linha, int coluna, char simbolo) {
        tabula[linha][coluna] = simbolo;
    }

    public boolean cheio() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tabula[i][j] == ' ')
                    return false;

        return true;
    }

    public boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++)
            if ((tabula[i][0] == simbolo && tabula[i][1] == simbolo && tabula[i][2] == simbolo) ||
                    (tabula[0][i] == simbolo && tabula[1][i] == simbolo && tabula[2][i] == simbolo))
                return true;

        return (tabula[0][0] == simbolo && tabula[1][1] == simbolo && tabula[2][2] == simbolo) ||
                (tabula[0][2] == simbolo && tabula[1][1] == simbolo && tabula[2][0] == simbolo);
    }

    public void imprimir() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabula[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---------");
        }
    }
}

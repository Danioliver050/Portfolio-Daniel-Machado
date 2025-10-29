public class Jogador {

    private String nome;
    private char simbolo;
    private int vitorias;

    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.vitorias = 0;
    }

    public String getNome() {
        return nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void adicionarVitoria() {
        this.vitorias++;
    }

    public void resetVitoria() {
        this.vitorias = 0;
    }
}

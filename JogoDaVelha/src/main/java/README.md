# Jogo da Velha em Java

Projeto desenvolvido em Java utilizando Programação Orientada a Objetos (POO), com foco na separação de responsabilidades entre classes, interação via console e controle completo do fluxo do jogo.

---

## Estrutura do Projeto

O projeto contém as seguintes classes:

| Classe        | Função |
|---------------|--------|
| `Main`        | Ponto de entrada da aplicação. Exibe o menu inicial e inicia o jogo. |
| `Jogar`       | Controla o fluxo da partida, configuração de jogadores, placar e lógica de repetição. |
| `Jogador`     | Representa cada jogador (nome, símbolo e número de vitórias). |
| `Tabuleiro`   | Manipula o tabuleiro, valida movimentos, exibe o jogo e verifica vencedor/empate. |

---

## Funcionalidades

- Cadastro dos jogadores com escolha do símbolo (X ou O)
- Exibição do tabuleiro a cada rodada
- Validação de jogadas (impede marcar posição já ocupada)
- Verificação automática de vitória ou empate
- Placar entre as partidas
- Pergunta ao usuário para continuar jogando
- Encerramento do programa ao responder "n"

---

## Como Executar

1. Baixe ou clone o repositório do projeto.
2. Abra em uma IDE Java (IntelliJ, Eclipse, VSCode com extensão Java).
3. Certifique-se de estar utilizando **JDK 17+**.
4. Compile e execute o arquivo `Main.java`.

 ## Regras do Jogo

- O jogador 1 escolhe o símbolo (X ou O)

- Os jogadores alternam as jogadas

- Ganha quem fizer três símbolos consecutivos (linha, coluna ou diagonal)

- Caso o tabuleiro seja preenchido sem vencedor, ocorre empate
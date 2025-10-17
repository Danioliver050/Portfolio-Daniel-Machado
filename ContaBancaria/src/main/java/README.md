# Sistema Bancário - ContaBancaria

Este projeto é um **sistema bancário** desenvolvido em **Java** com foco em **Programação Orientada a Objetos (POO)**. O objetivo é demonstrar habilidades em **lógica de programação**, **POO**, **interfaces simples com console** e **gestão de dados**.

---

## Funcionalidades

O sistema permite realizar as seguintes operações bancárias:

- Criar contas para clientes com nome, CPF e saldo inicial.
- Consultar contas cadastradas.
- Depositar valores em contas existentes.
- Realizar saques em contas.
- Transferir valores entre contas.
- Excluir contas permanentemente.
- Listar todas as contas cadastradas com informações detalhadas.

---

## Estrutura do Projeto

- **Banco.java**: Gerencia a lista de contas, criação, busca, exclusão e listagem de contas.
- **Conta.java**: Representa a conta bancária, com atributos como número da conta, saldo e cliente, além dos métodos de movimentação financeira.
- **Cliente.java**: Representa o cliente com atributos como nome e CPF.
- **Main.java**: Classe principal que implementa o menu interativo via console para interação com o sistema.

O projeto aplica conceitos de **POO**, como encapsulamento, composição (Cliente dentro da Conta) e abstração das operações bancárias.

---

## Tecnologias Utilizadas

- Java 17
- Listas (`ArrayList`) para armazenamento de contas
- Conceitos de POO: classes, objetos, métodos e encapsulamento
- Scanner para entrada de dados via console

---

## Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/SEU_USUARIO/Portfolio-Daniel-Machado.git
```
2. Abra o projeto no IntelliJ IDEA ou outra IDE Java de sua preferência.

3. Compile e execute a classe Main.java.

4. Siga as instruções no console para interagir com o sistema bancário.
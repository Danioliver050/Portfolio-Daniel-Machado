package ContaBancaria.port;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco();
        Scanner sc = new Scanner (System.in);

        while (true){

            System.out.println("/// Sistema Bancário ///");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Digite 1 para efetuar o cadastro e criar uma conta");
            System.out.println(" ");
            System.out.println("Digite 2 para efetuar um depósito");
            System.out.println(" ");
            System.out.println("Digite 3 para realizar um saque");
            System.out.println(" ");
            System.out.println("Digite 4 para relizar uma tranferência");
            System.out.println(" ");
            System.out.println("Digite 5 para Exibir contas");
            System.out.println(" ");
            System.out.println("Digite 6 para excluir sua conta");
            System.out.println(" ");
            System.out.println("Digite 0 para sair");
            System.out.println(" ");

            System.out.println("O que deseja fazer hoje? ");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1 -> {
                    sc.nextLine();
                    System.out.println("Informe seu nome: ");
                    String nome = sc.nextLine();
                    System.out.println(" ");
                    System.out.println("Agora informe seu CPF: ");
                    String cpf = sc.nextLine();
                    System.out.println(" ");
                    Cliente cliente = new Cliente (nome,cpf);
                    banco.criarConta(cliente);
                }
                case 2 -> {
                    System.out.println("nos informe o numero da sua conta?");
                    int numero = sc.nextInt();
                    System.out.println(" ");
                    System.out.println("Agora informe o valor que gostaria de depositar?");
                    double valor = sc.nextDouble();
                    System.out.println(" ");
                    Conta conta = banco.buscarConta(numero);
                    if (conta != null) conta.depositar(valor);
                }
                case 3 ->{
                    System.out.println("Informe qual o numero da sua conta");
                    int numero = sc.nextInt();
                    System.out.println(" ");
                    System.out.println("Qual valor deseja sacar da sua conta?");
                    double valor = sc.nextDouble();
                    System.out.println(" ");
                    Conta conta = banco.buscarConta(numero);
                    if (conta != null) conta.sacar(valor);
                }
                case 4 -> {

                    System.out.println("Qual o valor da transferência?");
                    double valor = sc.nextDouble();
                    System.out.println(" ");
                    System.out.println("De qual conta ira sair o valor dessa transferência?");
                    int origem = sc.nextInt();
                    System.out.println(" ");
                    System.out.println("E qual a conta irá receber o valor dessa transferência?");
                    int destino =sc.nextInt();
                    System.out.println(" ");
                    Conta contaOrigem = banco.buscarConta(origem);
                    Conta contaDestino = banco.buscarConta(destino);
                    if(contaOrigem != null && contaDestino != null ) contaOrigem.transferir(valor, contaDestino);
                }

                case 5 -> {
                    banco.listarContas();
                }

                case 6-> {
                    System.out.println("Qual o numero da conta que deseja apagar?");
                    int numero = sc.nextInt();
                    banco.excluirConta(numero);
                }
                case 0 -> {
                    System.out.println("Ok, até uma próxima!");

                sc.close();
                return;
            }
            default -> System.out.println("Opção inválida!");
           }
        }
    }
}

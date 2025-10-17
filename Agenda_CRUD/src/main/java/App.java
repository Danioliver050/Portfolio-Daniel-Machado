import service.Agenda;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        while (true) {

            {
                System.out.println("||| AGENDA TELEFÔNICA |||");
                System.out.print(" ");
                System.out.println("1 - Adicionar contato");
                System.out.print(" ");
                System.out.println("2 - Listar contatos");
                System.out.print(" ");
                System.out.println("3 - Atualizar contato");
                System.out.print(" ");
                System.out.println("4 - Remover contato");
                System.out.print(" ");
                System.out.println("0 - Sair");
                System.out.print(" ");
                System.out.print("Escolha uma opção: ");
                System.out.print(" ");
                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Certo, vamos adicionar esse contato");
                        System.out.print("Qual o nome? ");
                        String nome = sc.nextLine();
                        System.out.print("Qual o telefone? ");
                        String telefone = sc.nextLine();
                        System.out.print("E qual o email? ");
                        String email = sc.nextLine();
                        agenda.adcionarContato(nome, telefone, email);
                    }

                    case 2 -> {
                        agenda.listarContatos();
                    }

                    case 3 -> {
                        System.out.println("Qual a nova ID do contado?");
                        int novoNumero = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Qual o novo nome?");
                        String novoNome = sc.nextLine();
                        System.out.println("Qual o novo telefone?");
                        String novoTelefone = sc.nextLine();
                        System.out.println("E qual o novo email?");
                        String novoEmail = sc.nextLine();
                        agenda.atualizaContato(novoNumero, novoNome, novoTelefone, novoEmail);
                        System.out.println("Atualizado!");
                    }

                    case 4 -> {
                        System.out.println("Qual contato gostaria de remover?");
                        int idRemove = sc.nextInt();
                        agenda.removerContato(idRemove);
                    }

                    case 0 -> {
                        System.out.println("Ok, até a próxima");

                        sc.close();
                        return;
                    }

                    default -> System.out.println("Opção inválida");

                }

            }
        }
    }
}
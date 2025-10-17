package service;

import model.Contato;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Agenda {
    private List<Contato> contatos = new ArrayList<>();
    private int proximoId = 1;

    public void adcionarContato (String nome, String telefone,String email){
        Contato contato = new Contato(proximoId++, nome, telefone, email);
        contatos.add(contato);

        System.out.println("Contato adcionado com êxito");
    }

    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("Nenhum contato localizado através dessa busca");
        } else {
            for (Contato c: contatos){
                System.out.println(c);
            }
        }

    }
    public void atualizaContato(int id, String nome, String telefone, String email){
        Optional<Contato> contato= contatos.stream().filter(c -> c.getId() == id).findFirst();

        if(contato.isPresent()) {
            contato.get().setNome(nome);
            contato.get().setTelefone(telefone);
            contato.get().setEmail(email);
            System.out.println("Contato atualizado com sucesso");

        } else {System.out.println("Contato não encontrado");
        }
    }
    public void removerContato(int id){
        boolean removido = contatos.removeIf(c -> c.getId() == id);
        if (removido) {
            System.out.println("Contato removido com sucesso");
        } else {
            System.out.println("Contato não localizado");
        }
    }
}























package ContaBancaria.port;

import java.util.ArrayList;
import java.util.List;

public class Banco {
private List <Conta> contas = new ArrayList <>();
private int proxNumConta = 1;

public Conta criarConta (Cliente cliente) {
    Conta conta = new Conta (proxNumConta++, cliente,0);
    contas.add(conta);
    System.out.println("Conta criada com êxito para o usuário "+ cliente.getNome() );
    return conta;
}
public Conta buscarConta(int numero) {
    for (Conta conta:contas) {
        if (conta.getNumero() == numero) {
            return conta;
        }
    }
    System.out.println("Conta não localizada.");
    return null;

}
public boolean  excluirConta (int numero){
        Conta contaApagar =buscarConta(numero);

        if(contaApagar != null){
            String nomeCliente =contaApagar.getCliente().getNome();
            contas.remove(contaApagar);
            System.out.println("A conta de número: "+numero+", do portador de nome "+nomeCliente+", foi excluida de nosso sistema com sucesso.");
            return true;
        } else {
            System.out.println("Conta não localizada. Nenhuma ação de exclusão foi realizada.");
            return false;
        }
    }




    public void listarContas(){
    for (Conta conta :contas) {
        conta.exibirInfo();
    }
   }
}

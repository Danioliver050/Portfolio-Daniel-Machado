package ContaBancaria.port;

public class Conta {
    private int numero;
    private Cliente cliente;
    private double saldo;


    public Conta (int numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;

    }

    public int getNumero(){
        return numero;
    }
    public Cliente getCliente(){
        return cliente;

    }
    public double getSaldo (){
        return saldo;
    }

    public void depositar(double valor){
        if (valor>0) {
            saldo += valor;

            System.out.println("Depósito de R$ "+valor+" realizado com êxito!");

        } else {
        System.out.println("Valor inválido pra depósito");
       }
    }

    public void sacar (double valor) {
        if (valor>0 && valor <=saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ "+valor+" realizado com êxito!");
        } else {
            System.out.println("O valor é inválido pra saque");
       }
    }


    public void transferir (double valor, Conta destino) {
            if (valor > 0 && valor <= saldo) {
                this.saldo -= valor;
                destino.saldo += valor;
                System.out.println("Transferência no valor de "+ valor +" para "+ destino.getCliente().getNome()+ " realizada com êxito!");
            } else {
                System.out.println("Erro na transferência. Verifique o Saldo e tente novamente.");
            }
        }

              public void exibirInfo() {
                System.out.println("Conta: "+numero+" / Cliente: "+cliente.getNome()+" / Saldo: R$"+ getSaldo());
            }
    }



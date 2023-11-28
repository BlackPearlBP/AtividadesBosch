import java.util.ArrayList;

public class Banco {
        public ArrayList<Conta> listaDeContas = new ArrayList<Conta>();

        public void adicionarConta(Conta c){
            this.listaDeContas.add(c);
        }

        public String listarContas(){
            String contas="Os dados da conta são\n";

            for(Conta c : this.listaDeContas){
                contas+="\nAgência: "+c.agencia+"\nConta: "+c.numero+"\nSaldo: "+c.saldo+"\nTitular: "+c.titular.nome+"\nCPF do Titular: "+c.titular.cpf+"\nData de nascimento do titular: "+c.titular.dataNascimento;
            }

            return contas;
        }

        public Conta encontrarConta(int agencia, int numero) {
            for(Conta c : this.listaDeContas){
                if(c.agencia==agencia && c.numero==numero){
                    return c;
                }
            }
            return null;
        }
}

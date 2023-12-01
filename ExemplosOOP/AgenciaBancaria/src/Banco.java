import java.util.ArrayList;

public class Banco {
        private ArrayList<Conta> listaDeContas = new ArrayList<Conta>();

        public ArrayList<Conta> getListaDeContas() {
            return listaDeContas;
        }

        public void setListaDeContas(ArrayList<Conta> listaDeContas) {
            this.listaDeContas = listaDeContas;
        }

        public void adicionarConta(Conta c){
            this.listaDeContas.add(c);
        }

        public String listarContas(){
            String contas="Os dados da conta são\n";

            for(Conta c : this.listaDeContas){
                contas+="\nAgência: "+c.getAgencia()+"\nConta: "+c.getNumero()+"\nSaldo: "+c.getSaldo()+"\nTitular: "+c.getTitular().getNome()+"\nCPF do Titular: "+c.getTitular().getNome()+"\nData de nascimento do titular: "+c.getTitular().getDataNascimento();
            }

            return contas;
        }

        public Conta encontrarConta(int agencia, int numero) {
            for(Conta c : this.listaDeContas){
                if(c.getAgencia()==agencia && c.getNumero()==numero){
                    return c;
                }
            }
            return null;
        }
}

public class Conta {

    private int agencia;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia(){
        return this.agencia;
    }

    private Pessoa titular; //objeto titular da classe Pessoa
    private double saldo;

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor){
        return this.saldo+=valor;
    }
    public void sacar(double valor){
        this.saldo-=valor;
    }
}

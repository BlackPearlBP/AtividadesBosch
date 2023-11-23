public class Principal{
    public static void main(String[] args){
        double salario = 0;
        double valorEmprestimo = 0;
        int parcela = 0;
        salario=EntradaSaida.solicitarSalario();
        valorEmprestimo=EntradaSaida.solicitarValorEmprestimo();
        parcela=EntradaSaida.solicitarParcela();
        
        double valorMensalidade = 0;
        double salarioValidado=Calculo.calculoValidacaoSalario(salario);
        
        valorMensalidade=Calculo.calculoMensalidade(parcela, valorEmprestimo);
        String veredito=Validacao.validaEmprestimo(salarioValidado, valorMensalidade);
        EntradaSaida.mostrarResultado(salario, valorEmprestimo, parcela, valorMensalidade, veredito);


    }
}
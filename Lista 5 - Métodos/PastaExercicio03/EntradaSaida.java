import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double solicitarSalario(){
        return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário: "));
    }
    public static double solicitarValorEmprestimo(){
        double valorEmprestimo=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser emprestado: (Até R$200000 | Taxa de 35%)"));
        Validacao.validaValorEmprestimo(valorEmprestimo);
        return valorEmprestimo;
    }
    public static int solicitarParcela(){
        int parcela=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas desejadas: (Insira valor entre 1 e 150)"));
        Validacao.validaParcela(parcela);
        return parcela;
    }
    public static void mostrarResultado(double salario, double valorEmprestimo, int parcelas, double mensalidade, String veredito){
        DecimalFormat df = new DecimalFormat("##,###.00");
        JOptionPane.showMessageDialog(null, "Salário: R$"+df.format(salario)+"\nValor a ser emprestado: R$"+df.format(valorEmprestimo)+"\nQuantidade de parcelas: "+parcelas+"\nValor mensal: R$"+df.format(mensalidade)+"\nResultado final: \n"+veredito, "RESULTADO FINAL", 1);
    }
}

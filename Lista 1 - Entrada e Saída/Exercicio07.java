import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog("Digite seu nome e sobrenome: ");
        String mes=JOptionPane.showInputDialog("Digite o mês da venda: ");
        int carros=Integer.parseInt(JOptionPane.showInputDialog("Quantos carros foram vendidos? "));
        
        double salario = 1500.00;
        double comissao = 350.00;
        double comissaoCarros = comissao*carros;
        double comissaoTotal = 0.001;
        double totalVendas = (salario+comissaoCarros)*comissaoTotal+(salario+carros*comissaoCarros);

        JOptionPane.showMessageDialog(null, "Dados do funcionário: "+nome+"\nMês: "+mes+"\nNúmero de carros vendidos: "+carros+"\nSalário base: R$"+salario+
        "\nComissão dos carros vendidos: R$"+comissaoCarros+"\nTotal: R$"+totalVendas, "CÁLCULO DE SALÁRIO!", 1);

    }
}
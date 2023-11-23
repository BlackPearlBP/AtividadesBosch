import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        double valorCompra=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra: "));
        double valorRepresentante = (valorCompra*0.2);
        double valorImposto = (valorCompra*0.3);
        double valorVenda = valorRepresentante+valorImposto+valorCompra;

        JOptionPane.showMessageDialog(null, "O valor da mercadoria é: R$"+df.format(valorCompra)+"\nComissão do Representante: R$"+df.format(valorRepresentante)+
        "\nValor a ser pago de impostos: R$"+df.format(valorImposto)+"\nValor de venda final: R$"+df.format(valorVenda), "CONTAS!", 1);

    }
}
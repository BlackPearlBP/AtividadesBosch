import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio02{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,###.00");
        double valorProduto=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto: "));
        int qtdProduto=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que você deseja adquirir: "));
        double resultado;
        double desconto;
/*sugestao:
 * resultado=(double)valorProduto*qtdProduto;
 * 
 * if(quantidade>12){
 *     desconto=(valorProduto*0.1)*qtdProduto;
       resultado-=desconto);
 * 
 * }
 * 
 * 
*/
        if(qtdProduto<=12){
            resultado=(double)valorProduto*qtdProduto;
        }
        else{
            desconto=(valorProduto*0.1)*qtdProduto;
            resultado=(double)((valorProduto*qtdProduto)-desconto);
        }
    
        JOptionPane.showMessageDialog(null, "O valor total da compra será de: "+df.format((double)(resultado)), "Cálculo de compras!", 1);
    }
}
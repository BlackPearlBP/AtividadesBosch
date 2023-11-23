import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main(String[] args) {

        int qtdEstoque=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos em estoque: "));
        int qtdMaxima=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade máxima possível de produtos em estoque: "));
        int qtdMinima=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade mínima possível de produtos em estoque: "));
        double calculoMedia;

        calculoMedia=(qtdMaxima+qtdMinima)/2;

        if(calculoMedia>=qtdEstoque){
            JOptionPane.showMessageDialog(null, "Não efetuar compra! ", "AVISO!", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Efetuar compra!", "AVISO!", 1);
        }

    }
}
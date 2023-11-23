import javax.swing.JOptionPane;
 
public class Exercicio04{
    public static void main(String[] args){
        String exibirValor = "";
        int numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero: "));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("Escolha um incremento: "));
        for(int i=0; i<=numeroEscolhido; i+=incremento){
            exibirValor += i+" ";
        }
        JOptionPane.showMessageDialog(null, exibirValor);
    }
}
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int anterior = (numero1-1);
        int sequente = (numero1+1);

        JOptionPane.showMessageDialog(null, "O número digitado foi: "+numero1+"\nO anterior a ele é: "+anterior+"\nO próximo a ele é: "+sequente, "CONTAS!", 1);
    }
}
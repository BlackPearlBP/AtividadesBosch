import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.0");

        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: "));

        double media1 = (double)(nota1*0.4);
        double media2 = (double)(nota2*0.6);
        double mediaTotal = (double)media1+media2;

        JOptionPane.showMessageDialog(null, "A sua média final será: "+df.format(mediaTotal)+"\nA primeira nota foi: "+df.format(nota1)+
        ". seu valor final é: "+df.format(media1)+" (Peso - 40%)\nA segunda nota foi: "+df.format(nota2)+". seu valor final é: "+df.format(media2)+
        " (Peso - 60%).", "CÁLCULO MÉDIA!", 0);

    }
}
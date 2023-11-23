import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.0");
        
        String numero1=JOptionPane.showInputDialog("Digite um número:");
        String numero2=JOptionPane.showInputDialog("Digite outro número:");

        int primeiroNumero=Integer.parseInt(numero1);
        int segundoNumero=Integer.parseInt(numero2);

        int soma = primeiroNumero+segundoNumero;
        int subtracao = primeiroNumero-segundoNumero;
        int multiplicacao = primeiroNumero*segundoNumero;
        double elevado = (int)Math.pow(primeiroNumero,segundoNumero);
        double resto;
        double divisao;

        String resultados = "Contas realizadas entre esses números: \nSoma: "+soma+
        "\nSubtração: "+subtracao+"\nMultiplicação: "+multiplicacao+"\nPrimeiro elevado pelo segundo: "+elevado;
        if (segundoNumero != 0) {
            divisao = (double)primeiroNumero/segundoNumero;
            resultados = resultados + "\nDivisão: " + df.format(divisao);
        } else {
            resultados = resultados + "\nDivisão: não é possível dividir por zero!";
        }
        if (segundoNumero != 0) {
            resto = (double)primeiroNumero%segundoNumero;
            resultados = resultados + "\nResto da divisão: " + df.format(resto);
        } else {
            resultados = resultados + "\nResto da divisão: não é possível dividir por zero!";
        }

        JOptionPane.showMessageDialog(null,resultados,"CONTAS!",JOptionPane.INFORMATION_MESSAGE);

    }
}
import java.util.Random;

import javax.swing.JOptionPane;
public class Exercicio06{
    public static void main(String[] args) {
        Random rand = new Random();
        boolean advinhado=false;
        int contador = 3;
        int valor = rand.nextInt((100)+1);

        JOptionPane.showMessageDialog(null, "Um número aleatório foi gerado, tente advinhá-lo! ", "ADVINHAÇÃO! ", 1);
//sugiro usar do-while, porque a entrada uma 1ª vez é 'forçada' sempre
        while(advinhado==false && contador!=0){
            int numeroAdvinhado=Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 até 100: "));
            if(numeroAdvinhado!=valor){
                JOptionPane.showMessageDialog(null, "Você errou! :(\nNº de chances: "+(contador-1), "AVISO!", 1);
                contador=contador-1;
            }
            else{
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou! :)", "PARABÉNS!", 1);
                advinhado=true;
            }
        }
        if(contador==0){
            JOptionPane.showMessageDialog(null, "Você usou todas as chances e não acertou! :(\nNº de chances: "+contador, "AVISO!", 1);
        }
    }
}

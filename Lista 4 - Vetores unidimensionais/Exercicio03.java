import javax.swing.JOptionPane;

public class Exercicio03{
    public static void main(String[] args) {
        double[] numeros = new double[10];
        String exibirValores = "";
        int i = 0;
        double total = 0;
        double media = 0;

        for(i=0; i<10; i++){
            numeros[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));
            total = total + numeros[i];
            if(i==9){
            exibirValores += numeros[i]+".";
            }
            else{
                exibirValores += numeros[i]+", ";
            }
        }
        media = (total/10);
        JOptionPane.showMessageDialog(null, exibirValores+"\nA média desses valores é: "+media);

    }
}
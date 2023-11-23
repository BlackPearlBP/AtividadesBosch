import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorInverso = new int[10];
        String exibirValores = "";
        String exibirValoresInverso = "";
        int i = 0;
        
        for(i=0; i<10; i++){
            vetorA[i] = (int)(Math.random() * 100)+1;
            vetorInverso[i] += vetorA[i];
            if(i==9){
                exibirValores += vetorA[i]+".";
            }
            else{
                exibirValores += vetorA[i]+", ";
            }
        }
        for(i=0; i<vetorA.length/2; i++){
            int j = vetorInverso[i];
            vetorInverso[i] = vetorA[vetorA.length - i - 1];
            vetorInverso[vetorInverso.length - i - 1] = j;
        }
        for(i=0; i<10; i++){
            if(i==9){
                exibirValoresInverso += vetorInverso[i]+".";
            }
            else{
                exibirValoresInverso += vetorInverso[i]+", ";
            }
        }
        
        JOptionPane.showMessageDialog(null, exibirValores, "VETOR GERADO", 1);
        JOptionPane.showMessageDialog(null, exibirValoresInverso, "VETOR INVERSO", 1);
    }
}
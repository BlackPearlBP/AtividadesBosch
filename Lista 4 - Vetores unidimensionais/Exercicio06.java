import javax.swing.JOptionPane;

public class Exercicio06{
    public static void main(String[] args) {
        String exibirValoresUm = "";
        String exibirValoresDois = "";
        String exibirValoresResultado = "";
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int i = 0;
        
        for(i=0; i<10; i++){
            vetorA[i] = (int)(Math.random() * 100)+1;
            vetorB[i] = (int)(Math.random() * 100)+1;
            vetorC[i] = vetorA[i] + vetorB[i];
            if(i==9){
                exibirValoresUm += vetorA[i]+".";
                exibirValoresDois += vetorB[i]+".";
                exibirValoresResultado += vetorC[i]+".";
            }
            else{
                exibirValoresUm += vetorA[i]+", ";
                exibirValoresDois += vetorB[i]+", ";
                exibirValoresResultado += vetorC[i]+", ";
            }
        }
        JOptionPane.showMessageDialog(null, exibirValoresUm, "VETOR A", 1);
        JOptionPane.showMessageDialog(null, exibirValoresDois, "VETOR B", 1);
        JOptionPane.showMessageDialog(null, exibirValoresResultado, "SOMA DOS VETORES A E B", 1);
    }
}
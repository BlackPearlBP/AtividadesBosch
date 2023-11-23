import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exercicio06{
    public static void main(String[] args){
        int i = 0;
        int numeroTabuada=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para observar sua tabuada: "));
        String tabuada = "";
        JTextArea JtxArea = new JTextArea(tabuada);
        for(i=0; i<11; i++){
            tabuada +=(numeroTabuada+" x "+i+" = "+(numeroTabuada*i)+"\n");    
        }
        
        JOptionPane.showMessageDialog(null, tabuada,"TABUADA DE "+numeroTabuada,1);

    }
}
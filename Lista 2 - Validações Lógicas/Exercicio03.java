import javax.swing.JOptionPane;

public class Exercicio03{
    public static void main(String[] args){
        int golA=Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o time A fez: "));
        int golB=Integer.parseInt(JOptionPane.showInputDialog("Digite quantos gols o time B fez: "));
        String mensagem;
        int diferença;

        if(golA==golB){
            mensagem="Houve empate de pontos entre os times! ";
        }
        else if(golA>golB){
            diferença=golA-golB;
            mensagem="O time A venceu a partida com: "+diferença+" gols de vantagem! ";
        }
        else{
            diferença=golB-golA;
            mensagem="O time B venceu a partida com: "+diferença+" gols de vantagem! ";
        }
        JOptionPane.showMessageDialog(null, mensagem,"GOLS - TIMES A x B", 1);
    }
}
import javax.swing.JOptionPane;

public class Exercicio07{
    public static void main(String[] args) {
        String[] questoes = {"1","2"};
        String[] alternativasA = {"dá terremoto.","o buffet fica com desconto.","chove."};
        String[] alternativasB = {"1898","1889","1988"};

        int alternativaResposta;

        int alternativaQuestao=JOptionPane.showOptionDialog(null, "Selecione a questão que deseja responder: ", "QUIZ!!!", 1, 1,
        null, questoes, null);
        if(alternativaQuestao==0){
            alternativaResposta=JOptionPane.showOptionDialog(null, "Quando há previsão de evento astronômico visível em todo o Brasil, em Joinville...", "QUIZ!!!",
        1, 1, null, alternativasA, null);
            if(alternativaResposta==2){
                JOptionPane.showMessageDialog(null, "Você acertou! ", "PARABÉNS!!!", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Você errou! :(", "Que pena!", 1);
            }
        }
        else{
            alternativaResposta=JOptionPane.showOptionDialog(null, "Quando foi proclamada a República do Brasil? ", "QUIZ!!!", 1, 1,
        null, alternativasB, null);
            if(alternativaResposta==1){
                JOptionPane.showMessageDialog(null, "Você acertou! ", "PARABÉNS!!!", 1);
            }
                else{
                JOptionPane.showMessageDialog(null, "Você errou! :(", "Que pena!", 1);
            }
        } 
    }
}
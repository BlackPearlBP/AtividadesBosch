import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args){
        String[] opcoes = { "NÃO" , "SIM"};
        String[] graus = { "Sem" , "Fundamental Incompleto" , "Fundamental Completo" , "Médio Incompleto" , "Médio Completo" , "Superior Incompleto" , "Superior Completo" };
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        String nome=JOptionPane.showInputDialog("Informe seu nome:");

        String sobrenome=JOptionPane.showInputDialog("Informe seu sobrenome:");

        JOptionPane.showMessageDialog(null, "Bem-vindo(a), "+nome+" "+sobrenome+"!", "Boas-vindas!",JOptionPane.INFORMATION_MESSAGE);

        String dataNascimento=JOptionPane.showInputDialog("Digite sua data de nascimento: (xx/xx/xxxx)");

        double pretencao=Double.parseDouble(JOptionPane.showInputDialog("Insira sua pretenção salarial:"));

        String cargo=JOptionPane.showInputDialog("Qual seu cargo pretendido? ");

        int grauInstrucao=JOptionPane.showOptionDialog(null, "Selecione seu grau de instrução:", "Informação necessária!",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, graus, graus[0]);

        int temCNH=JOptionPane.showOptionDialog(null, "Você tem CNH B?", "Informação necessária!", JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog(null, "Seus dados: \nNome: "+nome+""+sobrenome+"\nData de nascimento: "+dataNascimento+ "\nPretensão salarial: R$"+df.format(pretencao)+"\nGrau de instrução: "+grauInstrucao+"\nCargo pretendido: "+cargo+"\nCNH B: "+temCNH+"\n\n" + (temCNH==0 ? "Não tem" : "Tem"), "Confirmação", 0);

    }
}
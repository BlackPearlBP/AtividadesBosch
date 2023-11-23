import javax.swing.JOptionPane;

public class Condicionais{
    public static void main(String[] args){
        int numeroDia=Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor de 1 a 7: "));
        while(numeroDia<7 || numeroDia>7){
            numeroDia=Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor de 1 a 7: "));
        }

        String diaSemana="O dia da semana é: ";

        switch(numeroDia){
            case 1:
                diaSemana+="Domingo";
            break;

            case 2:
                diaSemana+="Segunda";
            break;

            case 3:
                diaSemana+="Terça";
            break;

            case 4:
                diaSemana+="Quarta";
            break;

            case 5:
                diaSemana+="Quinta";
            break;

            case 6:
                diaSemana+="Sexta";
            break;

            case 7:
                diaSemana+="Sábado";
            break;

            default:
                diaSemana="O número informado não corresponde a nenhum dia da semana! ";
            //Caso padrão caso nenhum case seja escolhido, ou não tenha padrão;
        }
        JOptionPane.showMessageDialog(null, diaSemana);

    }
}
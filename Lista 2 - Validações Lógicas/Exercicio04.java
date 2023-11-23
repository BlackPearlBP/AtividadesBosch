import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio04{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,###.00");
        String[] opcoesDestino = {"Maceió","Porto de Galinhas"};
        String[] opcoesAlmoco = {"Sim","Não"};
        double calculo;
        int VALOR_BASE=3000;

        int local=(JOptionPane.showOptionDialog(null, "Selecione onde você deseja passar as férias: \nValor base: R$3000,00.", "PLANEJAMENTO DE FÉRIAS", 
        1, 1, null, opcoesDestino, null));
        int duvidaAlmoco=(JOptionPane.showOptionDialog(null, "Com almoço e janta incluso? \nValor base: R$3000,00.", "PLANEJAMENTO DE FÉRIAS", 
        1, 1, null, opcoesAlmoco, null));

        if(local==0 && duvidaAlmoco==0){
            calculo=(double)VALOR_BASE+(VALOR_BASE*1);
        }
        else if(local==0 && duvidaAlmoco==1){
            calculo=(double)VALOR_BASE+(VALOR_BASE*0.85);
        }
        else if(local==1 && duvidaAlmoco==0){
            calculo=(double)VALOR_BASE+(VALOR_BASE*0.60);
        }
        else{
            calculo=(double)VALOR_BASE+(VALOR_BASE*0.45);
        }
        JOptionPane.showMessageDialog(null, "Resultados finais:\nDestino: "+(local==0 ? "Maceió" : "Porto de Galinhas")+
        "\nAlmoço/janta incluído? "+(duvidaAlmoco==0 ? "Sim" : "Não")+"\n\nValor a pagar: R$"+df.format(calculo), null, 1);
    }
}
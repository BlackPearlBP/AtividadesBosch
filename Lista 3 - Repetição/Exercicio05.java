import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,###.00");
        String mensagemFinal = "";
        String[] possibilidades = {"SIM","NÃO"};
        double[] saldos = new double[10];
        boolean continuar = true;
        int i = 1;
        int numeroPessoas = 1;
        int saldosNegativos = 0;
        int saldosPositivos = 0;
        int resposta = 0;
        double contaFinal = 0;

        JOptionPane.showMessageDialog(null, "Bem-vindo, usuário!", "BOAS VINDAS", 1);
        while(continuar = true){
            for(i=0; i<10; i++){
                saldos[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite seu saldo: "));
                if(saldos[i]>=0){
                    saldosPositivos += 1;
                }
                else{
                    saldosNegativos += 1;
                }
                resposta=JOptionPane.showOptionDialog(null, "Deseja continuar inserindo saldos? ", "DÚVIDA:", 1, 1, null, possibilidades, null);
                if(resposta != 1){
                    numeroPessoas += 1;
                    contaFinal = (numeroPessoas*100)*(saldosNegativos*0.1);
                    if(contaFinal>50){
                        mensagemFinal = "Risco ao banco! ";
                    }
                    else{
                        mensagemFinal = "Nenhum risco! ";
                    }
                }
                else{
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "O total de pessoas é: "+numeroPessoas+"\nA porcentagem de saldos negativos é de: "+df.format(contaFinal)+"%\n"+mensagemFinal, null, resposta);
                    System.exit(0);
                }
            }
        }
    }
}
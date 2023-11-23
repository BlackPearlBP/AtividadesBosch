import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] possibilidades = {"Pares","Ímpares","Negativos","Positivos"};
        int[] numeros = new int[10];
        int quantidadeNumeros = 0;

        int i=0;
        for(i=0; i<10; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número inteiro: "));
        }
        int opcao=(JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MOSTRADOR NÚMEROS", 1, 1, null, possibilidades, null));
        switch(opcao){
            case 0:
                for(i=0; i<10; i++){
                    if(numeros[i] % 2 == 0){
                        quantidadeNumeros+=1;
                }
            }
                JOptionPane.showMessageDialog(null, "Existem "+quantidadeNumeros+" números pares!", "PARES!!!", 1);
            break;
            case 1:
            for(i=0; i<10; i++){
                    if(numeros[i] % 2 != 0){
                        quantidadeNumeros+=1;
                    }
                }
                JOptionPane.showMessageDialog(null, "Existem "+quantidadeNumeros+" números ímpares!", "ÍMPARES!!!", 1);
            break;
            case 2:
            for(i=0; i<10; i++){
                    if(numeros[i] < 0){
                        quantidadeNumeros+=1;
                    }
                }
                JOptionPane.showMessageDialog(null, "Existem "+quantidadeNumeros+" números negativos!", "NEGATIVOS!!!", 1);

            break;
            case 3:
            for(i=0; i<10; i++){
                    if(numeros[i] > 0){
                        quantidadeNumeros+=1;
                    }
                }
                JOptionPane.showMessageDialog(null, "Existem "+quantidadeNumeros+" números positivos!", "POSITIVOS!!!", 1);

            break;
            default:
        }
    }
    }
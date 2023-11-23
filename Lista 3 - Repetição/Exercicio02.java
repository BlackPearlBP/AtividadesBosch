import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        String[] possibilidades = {"IDADE MAIOR QUE 50 ANOS","ALTURA ACIMA DE 1.60 METROS","PESO ABAIXO DE 80KG","SAIR"};
        int[] idade = new int[10];
        double[] altura = new double[10];
        int[] peso = new int[10];
        int quantidadePessoas = 0;
        int i = 0;

        for(i=0; i<2; i++){
            idade[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: \nUtilize apenas números!"));
            altura[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa: \nUtilize o padrão X.XX!"));
            peso[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da pessoa: \nUtilize apenas números!"));
    }
        int opcao=(JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "MENU", 1, 1, null, possibilidades, null));
        switch(opcao){
            case 0:
                quantidadePessoas = 0;
            for(i=0; i<10; i++){
            if(idade[i] > 50){
                quantidadePessoas += 1;
            }
            else{
                quantidadePessoas += 0;
            }
        }
            JOptionPane.showMessageDialog(null, "A quantidade de pessoas com idade superior a 50 anos de idade é: "+quantidadePessoas, null, 1);
            break;
            
            case 1:
                quantidadePessoas = 0;
            for(i=0; i<10; i++){
            if(altura[i] > 1.60){
                quantidadePessoas += 1;
            }
            else{
                quantidadePessoas += 0;
            }
        }
            JOptionPane.showMessageDialog(null, "A quantidade de pessoas com altura superior a 1.60m é: "+quantidadePessoas, null, 1);
            break;
            
            case 2:
                quantidadePessoas = 0;
            for(i=0; i<10; i++){
            if(peso[i] < 80){
                quantidadePessoas += 1;
            }
            else{
                quantidadePessoas += 0;
            }
        }
            JOptionPane.showMessageDialog(null, "A quantidade de pessoas com peso inferior a 80 Kg é: "+quantidadePessoas, null, 1);
            break;
            
            case 3:
                System.exit(0);
            }
        }
    
    }
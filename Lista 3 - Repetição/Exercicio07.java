import javax.swing.JOptionPane;

public class Exercicio07{
    public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] altura = new double[5];
        double[] peso = new double[5];
        double maiorPeso = 0;
        double maiorAltura = 0;
        int nomePeso = 0;
        int nomeAltura = 0;
        int i = 0;

        for(i=0; i<5; i++){
            nomes[i]=JOptionPane.showInputDialog("Digite seu nome: ");
            altura[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
            peso[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        }
        for(i=0; i<5; i++){
            if(peso[i]>maiorPeso){
                maiorPeso = peso[i];
                nomePeso = i;
            }
            if(altura[i]>maiorAltura){
                maiorAltura = altura[i];
                nomeAltura = i;
            }
        }
        JOptionPane.showMessageDialog(null,
        "A pessoa mais pesada é: "+nomes[nomePeso]+", com "+maiorPeso+" Kg!\nA pessoa mais alta é: "+nomes[nomeAltura]+" com "+maiorAltura+" m! ", "RESULTADOS", 1);
    }
}
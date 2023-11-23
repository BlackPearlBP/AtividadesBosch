import javax.swing.JOptionPane;

public class Exercicio02{
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int i = 0;
        int maior = 0;
        int menor = 9999;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for(i=0; i<5; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        }
        for(i=0; i<5; i++){
            if(numeros[i]<menor){
                menor = numeros[i];
                posicaoMenor = i+1;
            }
            if(numeros[i]>maior){
                maior = numeros[i];
                posicaoMaior = i+1;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior número é: "+maior+", na posição: "+posicaoMaior+
        "\nO menor número é: "+menor+", na posição: "+posicaoMenor, "RESULTADOS", 1);
    }
}
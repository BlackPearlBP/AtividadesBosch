import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args) {
        int[] numeros = new int[10];
        boolean repetido = false;
        int i = 0;
        int numeroInserido = 0;
        int local = 0;
        String resposta = "Não há repetição!";
        for(i=0; i<10; i++){
            int numeroAleatorio = (int)(Math.random()*100)+1;
            numeros[i]=numeroAleatorio;
            System.out.println(numeros[i]);
        }
        numeroInserido=Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 01 e 100: ")); 
        for(i=0; i<10; i++){
                if(numeros[i] == numeroInserido){
                    repetido = true;
                    local = i+1;
                    resposta = "Há repetição!\nPosição de duplicação: "+local;
                }
                else{
                    System.out.println("ok");
                    System.out.println("não repete");
                }
        }

        JOptionPane.showMessageDialog(null, resposta, "RESULTADO", 1);
    }
}
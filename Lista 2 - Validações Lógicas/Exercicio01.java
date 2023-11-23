import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        String mensagem="A categoria que você se encaixa é: ";
        
        if(idade>=0 || idade<=14){
            mensagem+="Criança";
        }
        else if(idade>=14 || idade<=17){
            mensagem+="Adolescente";}
        else if(idade>=17 || idade<=30){
            mensagem+="Adulto jovem";
        }
        else if(idade>30){
            mensagem+="Adulto";
        }
        JOptionPane.showMessageDialog(null, mensagem, "Idade! ", 1);
    
    }
}
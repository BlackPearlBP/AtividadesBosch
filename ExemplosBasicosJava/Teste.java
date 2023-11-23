import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Teste{
    public static void main(String[] args){
        
        //Cria um objeto da classe DecimalFormat;
        //O método DecimalFormat é um método especial (construtor), e por isso tem o mesmo nome da Classe;
        //Dentro do método são colocados os argumentos/parâmetros para a construção do padrão objeto;
        DecimalFormat df = new DecimalFormat("#,###.00");
        //JOptionPane não é uma classe nativa.
        //Classe variavel=Classe.nomeMetodo(argumentos).
        String nome=JOptionPane.showInputDialog("Informe seu nome:");
        
        //Da direita para a esquerda, a variável "nome" recebe o retorno do método, logo, tem retorno da String.
        double nota1= Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota:"));
        //Double.parseDouble define o tipo de retorno, que é double, logo, a String recebida pela showInputDialog
        //será convertida em double pelo método parseDouble da classe Double.
        
        double nota2= Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota:"));
        double media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null, "A média do estudante \n"+nome+" é "+df.format(media));
        //df.format() -> chama o objeto criado anteriormente df, utiliza o format para formatar conforme a configuração do objeto;
        //O \n pula linha; o + concatena.

    }
}
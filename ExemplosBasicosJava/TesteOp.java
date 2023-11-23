import javax.swing.JOptionPane;

public class TesteOp{
    public static void main(String[] args){
        String[] opcoes = {"Sim","Não"};
        //Cria uma String de ordem(array) com os valores possíveis no questionário;
        
        int temCNH=JOptionPane.showOptionDialog(null, "Você tem CNH?","DOCUMENTAÇÃO",1,1,null,opcoes,null);
        //Cria uma variável de inteiro que recebe o valor originário do questionário;
        /* Configuração: JOptionPane.showOptionDialog(componenteOpcional,"Escrita interna","Título",tipoDeQuestão(sim/não, ok/talvez, ok,sim...),
        tipoDeMensagem(ícone padronizado que irá aparecer do lado), íconeCustomizado(imagem escolhida pelo usuário; opcional),
        opcõesDeSeleção(Array),seleçãoPadrão(alguma das seleções já vem marcada; opcional))
        */
        
        JOptionPane.showMessageDialog(null,"Tem CNH: "+(temCNH==0 ? "SIM" : "NÃO"),"DOCUMENTAÇÃO",1);
        /*Cria uma caixa de diálogo que mostrará o texto "Tem CNH: ", mais a verificação dos dados recebidos pelo questionário anterior. 
        O (temCNH==0 ? "SIM" : "NÃO") é um operador ternário; os dados do questionário serão números baseados na posição da opção (Ex: String[] opcoes = {0,1});
        caso o usuário selecione a opção "Sim", o valor de saída será 0. O operador ternário fará a verificação de que caso o valor de saída temCNH é igual a 0,
        ele irá substituir o número 0 pela palavra "SIM".
        */
    }
}
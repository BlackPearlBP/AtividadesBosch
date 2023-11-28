import java.text.DecimalFormat;

import javax.swing.JOptionPane;
//Da uma olhadinha na lógica desse, sempre 8 pessoas responderam ótimo
public class Exercicio03{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String[] opcoesSaida = {"SIM","NÃO"};
        String[] avaliacaoFilme = {"Ótimo","Bom","Ruim"};
        int[] pessoas = new int[10];
        int quantidadePessoasOtimo = 0;
        int quantidadePessoasBom = 0;
        int quantidadePessoasRuim = 0;
        double porcentagemPessoasOtimo = 0;
        double porcentagemPessoasBom = 0;
        double porcentagemPessoasRuim = 0;
        int i = 0;
        boolean continuar = true;

        while(continuar = true){ //sugiro usar do-while
        for(i=0; i<10; i++){
            JOptionPane.showMessageDialog(null, "Dê sua opinião sobre o filme XXXXXXXXXXX!", "FILMES", 1);
            pessoas[i]=JOptionPane.showOptionDialog(null, "Qual a sua avaliação em relação ao filme? ", "AVALIAÇÃO", 1, 1, null, avaliacaoFilme, null);
            int opcao=JOptionPane.showOptionDialog(null, "Deseja continuar? ", "PERGUNTA", 0, 1, null, opcoesSaida, null);
            if(opcao == 1){
                for(i=0; i<10; i++){
                    if(pessoas[i] == 0){
                        quantidadePessoasOtimo += 1;
                    }
                }
                porcentagemPessoasOtimo = (10*10)*(quantidadePessoasOtimo*0.1);
                for(i=0; i<10; i++){
                    if(pessoas[i] == 1){
                        quantidadePessoasBom += 1;
                    }
                }
                porcentagemPessoasBom = (10*10)*(quantidadePessoasBom*0.1);
                for(i=0; i<10; i++){
                    if(pessoas[i] == 2){
                        quantidadePessoasRuim += 1;
                    }
                }
                porcentagemPessoasRuim = (10*10)*(quantidadePessoasRuim*0.1);
                continuar = false;
                JOptionPane.showMessageDialog(null, "A quantidade de avaliações 'Ótimo' é de: "+quantidadePessoasOtimo+" pessoas!\nRepresentando: "+df.format(porcentagemPessoasOtimo)+
        "% do total.\nA quantidade de avaliações 'Bom' é de: "+quantidadePessoasBom+" pessoas!\nRepresentando: "+df.format(porcentagemPessoasBom)+
        "% do total. \nA quantidade de avaliações 'Ruim' é de: "+quantidadePessoasRuim+"pessoas!\nRepresentando: "+df.format(porcentagemPessoasRuim)+"% do total.", 
        "AVALIAÇÕES - ÓTIMO", 1);
        System.exit(0);
            }
        }       
    }
    }
}
   
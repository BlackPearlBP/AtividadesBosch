import javax.swing.JOptionPane;

public class Exercicio04{
    public static void main(String[] args) {
        String[] disciplinas = new String[4];
        String[] cargasHorarias = new String[4];
        String[] nomeProfessor = new String[4];
        String[] opcaoSaida = {"SIM","NÃO"};
        int saida = 0;
        int opcoes = 0;
        boolean sair = false;
        int i = 0;

        for(i=0; i<4; i++){
            disciplinas[i]=JOptionPane.showInputDialog("Digite o nome da disciplina: ");
            cargasHorarias[i]=JOptionPane.showInputDialog("Digite a carga horária da disciplina: ");
            nomeProfessor[i]=JOptionPane.showInputDialog("Digite o nome do professor da disciplina: ");
        }
        while(sair != true){
        opcoes=JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "AGENDA", 1, 1, null, disciplinas, null);
        JOptionPane.showMessageDialog(null, "Disciplina: "+disciplinas[opcoes]+"\nCarga horária: "+cargasHorarias[opcoes]+"\nNome do professor responsável: "+nomeProfessor[opcoes]);
        saida=JOptionPane.showOptionDialog(null, "Deseja sair? ", "AVISO", 1, 1, null, opcaoSaida, null);
        if(saida == 0){
            sair = true;
        }
    }
    }
}
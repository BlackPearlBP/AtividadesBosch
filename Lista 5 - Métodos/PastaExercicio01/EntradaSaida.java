import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double solicitarNotas(String contador){
        double numero = 0;
        numero=Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: "+contador+" (Formato de nota - X.X)"));
        return numero;
    }
    public static double solicitarPesos(String contador) {
        double numeroPeso=Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da "+contador+" nota: (0 a 100% - Usar apenas números!)"));
        return numeroPeso;
    }
    public static void mostrarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg, "AVISO", 0);
    }
    public static int pedirOperacao(){
        String[] opcoes = {"Média Ponderada","Média Aritmética"};
        return JOptionPane.showOptionDialog(null, "Selecione a opção desejada:", "SELEÇÃO", 1, 1, null, opcoes, null);
    }
    
}

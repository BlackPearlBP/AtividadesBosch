import javax.swing.JOptionPane;

public class Resultado {
    public static void mostrarResultado(double nota1, double nota2, double resultado, int operacao){
        String op="";
        if(operacao==0){
            op="Média Ponderada";
        }
        else{
            op="Média Aritmética";
        }
        JOptionPane.showMessageDialog(null, "O resultado da "+op+" entre "+nota1+" e "+nota2+" é "+resultado, "RESULTADO", 1);
    }
}

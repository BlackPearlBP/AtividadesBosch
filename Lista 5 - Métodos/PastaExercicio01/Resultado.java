import javax.swing.JOptionPane;

public class Resultado {
    public static void mostrarMedia(double nota1, double nota2, double resultado){
        JOptionPane.showMessageDialog(null, "O resultado da média entre "+nota1+" e "+nota2+" é de "+resultado, "RESULTADO FINAL", 1);
    }
}

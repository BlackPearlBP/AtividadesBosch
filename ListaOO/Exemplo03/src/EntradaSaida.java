import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int solicitarOpcaoMenu() {
        return 0;
    }

    public static int solicitarCaracteristicas(String msg) {
        return JOptionPane.showInputDialog("informe "+msg);
    }
    
}

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double solicitarNumeros(String contador){
        double numero=Double.parseDouble(JOptionPane.showInputDialog("Informe o "+contador+" número: "));
        return numero;
    }
    public static int pedirOperacao(){
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada\n"+"1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));
    }
    public static void mostrarMensagem(String msg){
        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!", "AVISO!", 0);
    }
    public static void mostrarResultado(double numero1, double numero2, int operacao, double resultado){
        String op="";
        if(operacao==1){
            op="soma";
        }else if(operacao==2){
            op="subtração";
        }else if(operacao==3){
            op="multiplicação";
        }else{
            op="divisão";
        }
        JOptionPane.showMessageDialog(null, "O resultado da "+operacao+" entre "+numero1+" e "+numero2+" é "+resultado, op, operacao);
    }
}

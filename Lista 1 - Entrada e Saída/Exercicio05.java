import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main(String[] args) {
        int horas=Integer.parseInt((JOptionPane.showInputDialog("Digite o valor de horas")));
        int minutos=Integer.parseInt((JOptionPane.showInputDialog("Digite o valor de minutos: ")));

        int horasSegundos = (horas*3600);
        int minutosSeguntos = (minutos*60);
        int total = horasSegundos+minutosSeguntos;

        JOptionPane.showMessageDialog(null, "O valor inserido foi:\n"+horas+":"+minutos+"\nEsse horário equivale a: "+total+" segundos", null, 1);

    }
}
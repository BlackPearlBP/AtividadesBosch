import javax.swing.JOptionPane;

public class Validacao {
    public static void validaParcela(int parcela){
        if(parcela<1 || parcela>150){
            JOptionPane.showMessageDialog(null, "Insira um valor entre 1 e 150!", "OPERAÇÃO INVÁLIDA", 1);
            EntradaSaida.solicitarParcela();
        }
    }
    public static void validaValorEmprestimo(double valorEmprestimo){
        if(valorEmprestimo<1 || valorEmprestimo>200000){
            JOptionPane.showMessageDialog(null, "Insira um valor entre R$ 1 e R$ 200000!", "OPERAÇÃO INVÁLIDA", 1);
            EntradaSaida.solicitarValorEmprestimo();
        }
    }
    public static String validaEmprestimo(double salarioValidado, double parcelaMensal){
        String veredito = "";
        if(salarioValidado<=parcelaMensal){
            veredito = "Salário incompatível!\nO valor da mensalidade não pode ser maior do que pelo menos 15% do seu salário!";
            return veredito;
        }
        else{
            veredito = "Sucesso! ";
            return veredito;
        }
    }
}

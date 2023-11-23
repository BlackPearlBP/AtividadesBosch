public class Calculo {
    public static double calculoMensalidade(int parcelas, double valorEmprestimo){
        return (((valorEmprestimo*0.35)+valorEmprestimo)/parcelas);
    }
    public static double calculoValidacaoSalario(double salario){
        return (salario*0.15);
    }
}

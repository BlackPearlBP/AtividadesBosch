public class Principal{
    public static void main(String[] args) {
        double salarioBruto = EntradaSaida.solicitarSalario();
        int horasExtras = EntradaSaida.solicitarHorasExtras();
        double resultado = 0;
        double descontoINSS = 0;
        double descontoIRPF = 0;
        double descontoPlanoSaude = 0;
        double acrescimoHoraExtra = 0;

        descontoINSS=Calculo.descontoINSS(salarioBruto);
        descontoIRPF=Calculo.descontoIRPF(salarioBruto);
        descontoPlanoSaude=Calculo.descontoPlanoSaude(salarioBruto);
        acrescimoHoraExtra=Calculo.acrescimoHoraExtra(salarioBruto, horasExtras);
        resultado=Calculo.salarioLiquido(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHoraExtra);

        EntradaSaida.mostrarResultado(salarioBruto, resultado);
    }
}
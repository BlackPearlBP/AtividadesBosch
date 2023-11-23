public class Calculo {
    public static double mediaPonderada(double nota1, double nota2, double peso1, double peso2){
        return ((nota1*(peso1*0.01))+(nota2*(peso2*0.01)));
    }
    public static double mediaAritmetica(double nota1, double nota2){
        return ((nota1+nota2)/2);
    }
}
